import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize a variable to store the factorial result
            long factorial = 1;

            // Use a while loop to compute the factorial
            int i = 1;
            while (i <= number) {
                factorial *= i;  // Multiply factorial by i
                i++;  // Increment i
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the Scanner
        input.close();
    }
}
