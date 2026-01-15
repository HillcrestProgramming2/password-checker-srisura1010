package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for CriteriaChecker class
 */
public class CriteriaCheckerTest {

    @Test
    public void testEvaluateCriteria_WeakPassword() {
        int score = CriteriaChecker.evaluateCriteria("12345");
        assertEquals(1, score);
    }

    @Test
    public void testEvaluateCriteria_ModeratePassword() {
        int score = CriteriaChecker.evaluateCriteria("password123");
        assertEquals(3, score);
    }

    @Test
    public void testEvaluateCriteria_StrongPassword() {
        int score = CriteriaChecker.evaluateCriteria("$ecuRe1234");
        assertEquals(5, score);
    }

    @Test
    public void testEvaluateCriteria_ResetValues() {
        CriteriaChecker.evaluateCriteria("$ecure1234");
        int score = CriteriaChecker.evaluateCriteria("abc");
        assertEquals(1, score);
    }

    @Test
    public void testDetermineStrength_Weak() {
        assertEquals("Weak", CriteriaChecker.determineStrength(0));
        assertEquals("Weak", CriteriaChecker.determineStrength(2));
    }

    @Test
    public void testDetermineStrength_Moderate() {
        assertEquals("Moderate", CriteriaChecker.determineStrength(3));
    }

    @Test
    public void testDetermineStrength_Strong() {
        assertEquals("Strong", CriteriaChecker.determineStrength(4));
        assertEquals("Strong", CriteriaChecker.determineStrength(5));
    }
}
