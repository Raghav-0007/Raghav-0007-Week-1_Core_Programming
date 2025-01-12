// Rocket countdown using the for-loop

import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        // Countdown using a for loop
        for(int i=counter; i>=1; i--) {
            System.out.println(counter + "...");
        }

        // Print launch message after countdown
        System.out.println("Liftoff!");

        // Close the Scanner
        input.close();
    }
}