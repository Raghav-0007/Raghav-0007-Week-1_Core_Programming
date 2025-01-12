// Calculate factorial using for loop

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number 
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
           
            long factorial = 1;

            // Use a while for to compute the factorial
            for(int i=0; i<=number; i++) {
                factorial *= i;                 
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the Scanner
        input.close();
    }
}