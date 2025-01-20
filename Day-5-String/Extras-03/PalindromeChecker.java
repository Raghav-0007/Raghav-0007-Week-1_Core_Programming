import java.util.Scanner;

public class PalindromeChecker {

    // Function to get user input
    static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        return input.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
    }

    // Function to check if the given string is a palindrome
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // String is a palindrome
    }

    // Function to display the result
    static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String userInput = getInput();  // Get input from the user
        boolean palindromeCheck = isPalindrome(userInput);  // Check palindrome condition
        displayResult(userInput, palindromeCheck);  // Display the result
    }
}

