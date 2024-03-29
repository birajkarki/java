package Intro;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        for (int attempts = 1; attempts <= 5; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == randomNumber) {
                hasGuessedCorrectly = true;
                break; // Exit the loop if the guess is correct
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        if (hasGuessedCorrectly) {
            System.out.println("Congratulations! You've guessed the correct number!");
        } else {
            System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
        }

        scanner.close();
    }
}
