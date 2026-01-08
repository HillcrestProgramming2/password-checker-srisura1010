package java.org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    public static String generateFeedback(String password){
        boolean hasDigit = CriteriaChecker.getDigit();
        boolean hasUpper = CriteriaChecker.getUpper();
        boolean hasLower = CriteriaChecker.getLower();
        boolean hasSpecial = CriteriaChecker.getSpecial();
        boolean hasLengthRequirement = CriteriaChecker.getLengthMet();

        if (!hasDigit) {
            System.out.println("Add at least one number");
        }
        if (!hasSpecial) {
            System.out.println("Include at least one special character.");
        }
        if (!hasUpper) {
            System.out.println("Add at least one uppercase letter.");
        }
        if (!hasLower) {
            System.out.println("Add at least one lowercase letter.");
        }
        if (!hasLengthRequirement) {
            System.out.println("Include at least one special character.");
        }
    }
}
