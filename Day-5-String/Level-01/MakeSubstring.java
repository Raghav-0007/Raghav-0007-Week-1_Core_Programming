// Program to create and compare substrings using charAt() and substring() methods with user input
import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create a substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    
    // Method to compare two strings character by character
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

    // Main method to test substring creation and comparison
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the original text: ");
        String originalText = scanner.next();
        
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();
        
        // Creating substring manually using charAt()
        String manualSub = manualSubstring(originalText, startIndex, endIndex);
        
        // Creating substring using built-in substring() method
        String builtInSub = originalText.substring(startIndex, endIndex);
        
        // Comparing both substrings using the compareStrings method
        boolean areEqual = compareStrings(manualSub, builtInSub);
        
        // Displaying the results
        System.out.println("Manual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);
        
        scanner.close();
    }
}

