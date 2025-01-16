import java.util.Scanner;

public class ShortestLongestWordFinder {

    // Method to find the length of a string without using length()
    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return count;
    }

    // Method to split the text into words without using split()
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

        // Extract words by identifying spaces
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

    // Method to create a 2D array with words and their lengths
    public static String[][] create2DArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // Word
            result[i][1] = String.valueOf(findLength(words[i]));  // Length as String
        }

        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLen = Integer.parseInt(wordArray[0][1]);
        int maxLen = Integer.parseInt(wordArray[0][1]);

        for (String[] wordData : wordArray) {
            int length = Integer.parseInt(wordData[1]);

            if (length < minLen) {
                minLen = length;
                shortest = wordData[0];
            }

            if (length > maxLen) {
                maxLen = length;
                longest = wordData[0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split input into words
        String[] words = customSplit(input);

        // Create a 2D array with words and their lengths
        String[][] wordLengthArray = create2DArray(words);

        // Find the shortest and longest words
        String[] shortestLongest = findShortestAndLongest(wordLengthArray);

        // Display the results
        System.out.println("\nWords and their lengths:");
        System.out.println("-----------------------");
        for (String[] row : wordLengthArray) {
            System.out.println(row[0] + " -> " + row[1]);
        }

        System.out.println("\nShortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);

        scanner.close();
    }
}
