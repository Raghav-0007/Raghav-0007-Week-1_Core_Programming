import java.util.Scanner;

public class WordLength2DArray {

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

        // Extract words using spaces
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

    // Method to display the 2D array in a tabular format
    public static void display2DArray(String[][] array) {
        System.out.println("\nWord\tLength");
        System.out.println("---------------");
        for (String[] row : array) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split the input into words
        String[] words = customSplit(input);

        // Create a 2D array with words and their lengths
        String[][] wordLengthArray = create2DArray(words);

        // Display the result
        display2DArray(wordLengthArray);

        scanner.close();
    }
}
