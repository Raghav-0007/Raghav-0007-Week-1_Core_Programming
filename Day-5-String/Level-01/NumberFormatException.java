import java.util.Scanner;

public class NumberFormatException{

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempting to parse a non-numeric string to an integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException and generic RuntimeException
    public static void handleException(String text) {
        try {
            // Calling the method to generate the exception
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException - Invalid number format!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Taking user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to parse as a number: ");
        String userInput = scanner.nextLine();

        // Calling the method to generate and handle the exception
        handleException(userInput);

        // Closing the scanner
        scanner.close();
    }
}
