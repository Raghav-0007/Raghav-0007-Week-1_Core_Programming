import java.util.Scanner;

public class FindCharFrequencies2 {

    // Method to find the length of the string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Resize the array to the number of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to find the frequency of unique characters in a string
    public static String[][] findUniqueCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int length = findLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        // Store unique characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display character frequencies
    public static void displayCharacterFrequencies(String[][] frequencies) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] pair : frequencies) {
            System.out.println("     " + pair[0] + "     |     " + pair[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] frequencies = findUniqueCharacterFrequencies(input);
        displayCharacterFrequencies(frequencies);

        scanner.close();
    }
}
