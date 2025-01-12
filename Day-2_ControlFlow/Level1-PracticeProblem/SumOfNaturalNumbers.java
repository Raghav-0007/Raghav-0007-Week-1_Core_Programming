import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number > 0) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number.");
        }

        // Close the Scanner object
        input.close();
    }
}
