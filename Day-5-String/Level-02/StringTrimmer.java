import java.util.Scanner;

public class StringTrimmer {

    // Method to find start and end indices after trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
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

    // Main method to demonstrate trimming and comparison
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();

        // Custom trimming
        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);

        // Built-in trimming
        String trimmedBuiltIn = input.trim();

        // Comparison
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Custom Trimmed String: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed String: '" + trimmedBuiltIn + "'");
        System.out.println("Are both strings equal? " + isEqual);

        scanner.close();
    }
}
