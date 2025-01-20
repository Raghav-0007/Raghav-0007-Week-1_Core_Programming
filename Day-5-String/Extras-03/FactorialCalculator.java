import java.util.Scanner;

public class FactorialCalculator {

    // Function to get user input
    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        return num;
    }

    // Recursive function to calculate factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    // Function to display the result
    static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        int number = getInput();  // Get user input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(number);  // Calculate factorial
            displayResult(number, fact);  // Display the result
        }
    }
}
