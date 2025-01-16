import java.util.Scanner;

public class CheckCharType {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert to lowercase if it's uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else if (ch >= 'a' && ch <= 'z') { // Check if it's a consonant
            return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    // Method to create a 2D array of characters and their types
    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterClassification(String[][] data) {
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s\n", row[0], row[1]);
        }
    }

    // Main method to get user input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] classifiedData = classifyCharacters(input);
        displayCharacterClassification(classifiedData);

        scanner.close();
    }
}
