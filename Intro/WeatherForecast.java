package Intro;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weather code (1-4):");
        System.out.println("1 - Sunny");
        System.out.println("2 - Cloudy");
        System.out.println("3 - Rainy");
        System.out.println("4 - Snowy");
        int weatherCode = sc.nextInt();
        sc.close();
        
        System.out.println("Today's weather:");

        switch (weatherCode) {
            case 1:
                System.out.println("It's a sunny day! Perfect for outdoor activities.");
                break; // break statement is used to exit the switch block
            case 2:
                System.out.println("It's cloudy. Maybe it will rain later, but for now, it's fine.");
                break;
            case 3:
                System.out.println("It's raining. Don't forget your umbrella!");
                break;
            case 4:
                System.out.println("It's snowy. Bundle up and stay warm!");
                break;
            default:
                System.out.println("Invalid weather code entered.");
        }
    }
}
