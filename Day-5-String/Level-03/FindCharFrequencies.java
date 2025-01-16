import java.util.Scanner;

public class FindCharFrequencies {

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

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256]; // ASCII character set
        int length = findLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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

        String[][] frequencies = findCharacterFrequencies(input);
        displayCharacterFrequencies(frequencies);

        scanner.close();
    }
}
