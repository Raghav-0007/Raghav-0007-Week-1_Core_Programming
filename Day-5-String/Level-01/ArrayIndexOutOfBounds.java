import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Attempting to access an index larger than the array's length
        String name = names[10]; // This will throw ArrayIndexOutOfBoundsException if array length is less than 11
        System.out.println("Name at index 10: " + name);
    }

    // Method to handle ArrayIndexOutOfBoundsException and generic RuntimeException
    public static void handleException(String[] names) {
        try {
            // Calling the method to generate the exception
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException - Invalid array index!");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Taking user input for the array of names
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character

        String[] names = new String[n];

        // Taking names as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Calling the method to generate and handle the exception
        handleException(names);

        // Closing the scanner
        scanner.close();
    }
}
