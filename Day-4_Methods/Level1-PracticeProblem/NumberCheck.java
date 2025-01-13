import java.util.Scanner;

public class NumberCheck {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;  // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check the number using the method
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
