import java.util.Scanner;

public class TextManipulation {

    // Method to convert text to lowercase using ASCII value logic
    public static String convertToLowerCaseUsingASCII(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert uppercase to lowercase by adjusting ASCII values
                currentChar = (char) (currentChar + 32);
            }
            lowerCaseText.append(currentChar);
        }
        
        return lowerCaseText.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

    // Method to split text into words without using the built-in split() method
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        String[] words = new String[text.length()];
        int wordCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isWhitespace(currentChar) || i == text.length() - 1) {
                if (i == text.length() - 1 && currentChar != ' ') {
                    word.append(currentChar); // Include the last character
                }
                words[wordCount++] = word.toString();
                word.setLength(0); // Reset the word
            } else {
                word.append(currentChar);
            }
        }
        
        // Return only the words that are not null
        String[] finalWords = new String[wordCount];
        System.arraycopy(words, 0, finalWords, 0, wordCount);
        
        return finalWords;
    }

    // Method to find and return the length of a string without using the length() method
    public static String findLengthOfString(String word) {
        int length = 0;
        while (true) {
            try {
                word.charAt(length); // Try accessing each character to count length
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return String.valueOf(length);
    }

    // Method to return a 2D array of words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = findLengthOfString(words[i]);
        }
        
        return wordLengths;
    }

    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();

        // Convert text using the custom method (ASCII logic)
        String customLowerCaseText = convertToLowerCaseUsingASCII(userInput);
        
        // Convert text using the built-in method
        String builtInLowerCaseText = userInput.toLowerCase();

        // Compare the results
        boolean areEqual = compareStrings(customLowerCaseText, builtInLowerCaseText);

        // Display results
        System.out.println("Text converted using custom method: " + customLowerCaseText);
        System.out.println("Text converted using built-in method: " + builtInLowerCaseText);
        System.out.println("Are both methods results equal? " + areEqual);

        // Split text into words and find their lengths
        String[] words = splitTextIntoWords(userInput);
        String[][] wordLengths = getWordsAndLengths(words);

        // Display word and their lengths in tabular format
        System.out.println("\nWord and Lengths:");
        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        // Closing the scanner
        scanner.close();
    }
}
