import java.util.Scanner;

public class CustomStringSplit {

    // Method to find the length of a string without using length()
    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split the string into words without using split()
    public static String[] customSplit(String input) {
        int length = findLength(input);
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;

        // Extract words using space positions
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                words[wordIndex++] = input.substring(start, i);
                start = i + 1;
            }
        }
        // Add the last word
        words[wordIndex] = input.substring(start, length);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Using the custom split method
        String[] customWords = customSplit(input);

        // Using the built-in split() method
        String[] builtInWords = input.split(" ");

        // Compare both results
        boolean areEqual = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        // Display comparison result
        if (areEqual) {
            System.out.println("\nBoth methods produced the same result.");
        } else {
            System.out.println("\nThe methods produced different results.");
        }

        scanner.close();
    }
}
