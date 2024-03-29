package Intro;
// Data Types
// 1. Primitive Data Types:  8 types 
// byte - 1 byte - 8 bits
//short - 2 bytes - 16 bits
//int - 4 bytes - 32 bits
//long - 8 bytes - 64 bits
//float - 4 bytes - 32 bits
//double - 8 bytes - 64 bits
//char - 2 bytes - 16 bits
//boolean - 1 byte - 8 bits
 
// 2. Non-Primitive Data Types : 5 types
// String 
//  Array - 1D, 2D, 3D
//  Class  - User Defined Data Type
//  Interface - User Defined Data Type
//  Object - User Defined Data Type


public class Variable {
    public static void main(String[] args) {
        // variable declaration
        String name = "Bob";
        int age = 20;
        double height = 5.6;
        boolean isStudent = false;
        int x = 10;
        int y = 20;


// print the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);  
        System.out.println("Sum: " + (x + y));  
    }
}
