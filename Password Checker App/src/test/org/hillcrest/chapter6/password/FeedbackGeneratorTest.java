package org.hillcrest.chapter6.password;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for FeedbackGenerator class
 */
public class FeedbackGeneratorTest {

    @Test
    public void testGenerateFeedback_WeakPassword() {
        CriteriaChecker.evaluateCriteria("12345");
        String feedback = FeedbackGenerator.generateFeedback("12345");

        assertTrue(feedback.contains("Increase the length"));
        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("lowercase"));
        assertTrue(feedback.contains("special character"));
    }

    @Test
    public void testGenerateFeedback_ModeratePassword() {
        CriteriaChecker.evaluateCriteria("password123");
        String feedback = FeedbackGenerator.generateFeedback("password123");

        assertTrue(feedback.contains("uppercase"));
        assertTrue(feedback.contains("special character"));
        assertFalse(feedback.contains("lowercase"));
    }

    @Test
    public void testGenerateFeedback_StrongPassword() {
        CriteriaChecker.evaluateCriteria("$ecuRe1234");
        String feedback = FeedbackGenerator.generateFeedback("$ecuRe1234");

        assertEquals("", feedback);
    }
}
