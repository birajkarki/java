package Intro;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to start the countdown: ");
        int countdownNumber = scanner.nextInt();

        System.out.println("Countdown begins:");

        while (countdownNumber > 0) {
            System.out.println(countdownNumber + "...");
            countdownNumber--;
            try {
                Thread.sleep(1000); // Delay for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Blastoff!");

        scanner.close();
    }
}
