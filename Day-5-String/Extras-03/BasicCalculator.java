import java.util.Scanner;

public class BasicCalculator {

    // Function to add two numbers
    static double add(double a, double b) {
        return a + b;
    }

    // Function to subtract two numbers
    static double subtract(double a, double b) {
        return a - b;
    }

    // Function to multiply two numbers
    static double multiply(double a, double b) {
        return a * b;
    }

    // Function to divide two numbers (handles division by zero)
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Return Not-a-Number (NaN) in case of division by zero
        }
        return a / b;
    }

    // Function to get user input for numbers
    static double[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    // Function to display the menu and get the user's choice
    static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int choice = getUserChoice();  // Get user choice
        double[] numbers = getNumbers();  // Get two numbers from the user
        double result = 0;

        // Perform operation based on user choice
        switch (choice) {
            case 1:
                result = add(numbers[0], numbers[1]);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = subtract(numbers[0], numbers[1]);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = multiply(numbers[0], numbers[1]);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = divide(numbers[0], numbers[1]);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }
}

