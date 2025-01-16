import java.util.Scanner;

public class CheckPalindrom {

    // Method 1: Iterative Palindrome Check
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive Palindrome Check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method 3: Palindrome Check Using Reversed String
    public static boolean isPalindromeByReversing(String text) {
        String reversed = reverseString(text);
        return text.equals(reversed);
    }

    // Method to reverse a string using charAt()
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Logic 1: Iterative check
        boolean isPalindromeIterative = isPalindromeIterative(input);
        System.out.println("Iterative Check: " + (isPalindromeIterative ? "Palindrome" : "Not Palindrome"));

        // Logic 2: Recursive check
        boolean isPalindromeRecursive = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Recursive Check: " + (isPalindromeRecursive ? "Palindrome" : "Not Palindrome"));

        // Logic 3: Reverse and compare
        boolean isPalindromeByReversing = isPalindromeByReversing(input);
        System.out.println("Reverse and Compare Check: " + (isPalindromeByReversing ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
