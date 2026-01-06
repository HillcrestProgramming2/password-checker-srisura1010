package java.org.hillcrest.chapter6.password;

public class CriteriaChecker {

    //utility class

    public static int evaluateCriteria(String password) {

        int criteriaMet = 0;
        String specialChars = "!@#$%^&*()-+=";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i=0; i<=password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (specialChars.charAt(c) >= 0) {
                hasSpecial = true;
            }
        }

        if (hasUpper) criteriaMet++;
        if (hasLower) criteriaMet++;
        if (hasDigit) criteriaMet++;
        if (hasSpecial) criteriaMet++;

        return criteriaMet;
    }

    public static String determineStrength(int score) {
        if (score >= 0 && score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else if (score >= 4) {
            return "Strong";
        } else {
            return "Invalid Score";
        }
    }
}
