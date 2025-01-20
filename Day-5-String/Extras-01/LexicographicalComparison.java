import java.util.Scanner;

public class LexicographicalComparison {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;  // Return the difference in ASCII values
            }
        }

        // If all characters so far are the same, compare lengths
        return length1 - length2;
    }

    // Main method to test the program
    public static void main(String[] args) {
		
		
// create a Scanner class object for taking input
Scanner sc = new Scanner(System.in);

// taking input from user
System.out.println("Enter the string 1");
String str1=sc.next();
System.out.println("Enter the string 2");
String str2=sc.next();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
