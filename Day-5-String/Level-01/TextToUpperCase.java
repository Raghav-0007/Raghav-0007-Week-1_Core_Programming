import java.util.Scanner;

public class TextToUpperCase {

    // Method to convert each character to uppercase using ASCII values
    public static String convertToUpperCaseUsingASCII(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Convert lowercase to uppercase by adjusting ASCII values
                currentChar = (char) (currentChar - 32);
            }
            upperCaseText.append(currentChar);
        }
        
        return upperCaseText.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Convert text using the custom method
        String customUpperCaseText = convertToUpperCaseUsingASCII(userInput);
        
        // Convert text using the built-in method
        String builtInUpperCaseText = userInput.toUpperCase();

        // Compare the results
        boolean areEqual = compareStrings(customUpperCaseText, builtInUpperCaseText);

        // Display the results
        System.out.println("Text converted using custom method: " + customUpperCaseText);
        System.out.println("Text converted using built-in method: " + builtInUpperCaseText);
        System.out.println("Are both methods results equal? " + areEqual);

        // Closing the scanner
        scanner.close();
    }
}
