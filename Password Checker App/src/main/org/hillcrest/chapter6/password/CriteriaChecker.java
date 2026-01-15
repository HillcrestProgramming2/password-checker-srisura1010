package org.hillcrest.chapter6.password;

public class CriteriaChecker {

    //utility class

    private static boolean hasUpper = false;
    private static boolean hasLower = false;
    private static boolean hasDigit = false;
    private static boolean hasSpecial = false;
    private static boolean hasLengthRequirement = false;


    public static int evaluateCriteria(String password) {

        hasUpper = false;
        hasLower = false;
        hasDigit = false;
        hasSpecial = false;
        hasLengthRequirement = false;

        int criteriaMet = 0;
        String specialChars = "!@#$%^&*()-+=";


        for(int i=0; i<password.length(); i++) {
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
            if (specialChars.indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }

        if (password.length()>=8) {
            hasLengthRequirement = true;
        }

        if (hasUpper) criteriaMet++;
        if (hasLower) criteriaMet++;
        if (hasDigit) criteriaMet++;
        if (hasSpecial) criteriaMet++;
        if (hasLengthRequirement) criteriaMet++;

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

    public static boolean getDigit() {return hasDigit;}
    public static boolean getUpper() {return hasUpper;}
    public static boolean getSpecial() {return hasSpecial;}
    public static boolean getLower() {return hasLower;}
    public static boolean getLengthMet() {return hasLengthRequirement;}
}
