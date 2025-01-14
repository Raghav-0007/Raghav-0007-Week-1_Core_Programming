import java.util.Scanner;

public class IllegalArgumentException {

    // Method to generate IllegalArgumentException
    public static void generateException(String str) {
        // Using substring() with start index greater than end index
        String subStr = str.substring(5, 2); // This will throw IllegalArgumentException
        System.out.println("Substring: " + subStr);
    }

    // Method to handle IllegalArgumentException and generic RuntimeException
    public static void handleException(String str) {
        try {
            // Calling the method to generate the exception
            generateException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException - Start index is greater than end index!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Taking user input for the string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the method to generate and handle the exception
        handleException(userInput);

        // Closing the scanner
        scanner.close();
    }
}
