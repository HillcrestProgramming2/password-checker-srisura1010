package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    public static String generateFeedback(String password){

        String feedback = "";

        if (!CriteriaChecker.getLengthMet()) {
            feedback += "- Increase the length to at least 8 characters\n";
        }
        if (!CriteriaChecker.getUpper()) {
            feedback += "- Add at least one uppercase letter \n";
        }
        if (!CriteriaChecker.getLower()) {
            feedback += "- Add at least one lowercase letter \n";
        }
        if (!CriteriaChecker.getSpecial()) {
            feedback += "- Add at least one special character \n";
        }
        if (!CriteriaChecker.getDigit()) {
            feedback += "- Add at least one number \n";
        }

        return feedback;
    }
}
