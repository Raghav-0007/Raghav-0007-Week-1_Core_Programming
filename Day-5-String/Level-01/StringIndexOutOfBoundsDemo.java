import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Attempting to access index beyond the length of the string
        char character = str.charAt(str.length()); // This will throw the exception
        System.out.println("Character at index " + str.length() + ": " + character);
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch block
    public static void handleException(String str) {
        try {
            // Calling the method to generate the exception
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: String index out of bounds!");
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
