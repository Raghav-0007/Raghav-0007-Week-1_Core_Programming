import java.util.Scanner;

public class UniqueCharacterFinder {

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
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueIndex; j++) {
                if (currentChar == uniqueChars[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Method to display unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);
        displayUniqueCharacters(uniqueChars);

        scanner.close();
    }
}
