// Program to return all characters in a string and compare with toCharArray() method
import java.util.Scanner;

public class StringToArray {
    
    // Method to convert a string to a character array manually
    public static char[] manualToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }
    
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method to test character array conversion and comparison
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the original text: ");
        String originalText = scanner.next();
        
        // Creating character arrays
        char[] manualArray = manualToCharArray(originalText);
        char[] builtInArray = originalText.toCharArray();
        
        // Comparing both character arrays
        boolean areEqual = compareCharArrays(manualArray, builtInArray);
        
        // Displaying the results
        System.out.print("Manual Character Array: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }
        
        System.out.print("\nBuilt-in Character Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        
        System.out.println("\nAre both character arrays equal? " + areEqual);
        
        scanner.close();
    }
}
