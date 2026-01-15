package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordApp {
    //main method goes here
    //prompt user for password
    //Check strength
    //Provide user feedback based on the strength

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scan.nextLine();

        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);

        System.out.println("Password Strength: " + strength + " (" + score + "/5)");

        String feedback = FeedbackGenerator.generateFeedback(password);

        if (!feedback.isEmpty()) {
            System.out.println("Suggestions to improve your password:");
            System.out.print(feedback);
        }

        scan.close();
    }
}
