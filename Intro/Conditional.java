package Intro;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println("Enter another number: ");
        int y = sc.nextInt();
        sc.nextLine(); 
        sc.close(); 
        

        // if else
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } 
        else if (x == y) {
            System.out.println(x + " is equal to " + y);
        }
        else {
            System.out.println(y + " is greater than " + x);
        }


     
    }   
}
