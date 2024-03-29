package Intro;
import java.util.Scanner;

public class InputValue {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);

        // Asking for name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        // Asking for age
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // Asking for height
        System.out.println("Enter your height (in meters): ");
        double height = sc.nextDouble();

        // Asking if the user is a student
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

    
        // Closing the scanner to prevent resource leak
        sc.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student? " + isStudent);
    }
}
