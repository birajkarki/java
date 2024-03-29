package Intro;

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] answers = {
            "Yes",
            "No",
            "Maybe",
            "Ask again later",
            "Outlook not so good",
            "Definitely",
            "Cannot predict now"
        };

        System.out.println("Welcome to the Magic Eight Ball!");
        
        do {
            System.out.print("Ask a question (or type 'quit' to exit): ");
            String question = scanner.nextLine();
            
            if (question.equalsIgnoreCase("quit")) {
                break; // Exit the loop if the user types 'quit'
            }

            String answer = answers[random.nextInt(answers.length)];
            System.out.println("The Magic Eight Ball says: " + answer);
        } while (true);

        System.out.println("Thank you for playing the Magic Eight Ball!");
        scanner.close();
    }
}
