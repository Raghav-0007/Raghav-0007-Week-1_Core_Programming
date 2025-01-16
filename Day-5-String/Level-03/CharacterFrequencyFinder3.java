import java.util.Scanner;

public class CharacterFrequencyFinder3 {

    // Method to find the frequency of characters using nested loops
    public static String[][] findCharacterFrequencies(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];

        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark as counted
                }
            }
        }

        // Count non-duplicate characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index][0] = Character.toString(characters[i]);
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
