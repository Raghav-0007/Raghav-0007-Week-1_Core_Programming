import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. I will try to guess it!");
        System.out.println("Respond with:\n'h' if my guess is too high\n'l' if my guess is too low\n'c' if my guess is correct");
        
        playGame(scanner);
        scanner.close();
    }

    // Main game loop
    public static void playGame(Scanner scanner) {
        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (h/l/c): ");
            String feedback = scanner.nextLine().trim().toLowerCase();

            guessedCorrectly = updateRange(feedback, guess, scanner, low, high);
            if (feedback.equals("h")) {
                high = guess - 1;
            } else if (feedback.equals("l")) {
                low = guess + 1;
            } else if (!feedback.equals("c")) {
                System.out.println("Invalid input! Please enter 'h', 'l', or 'c'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, something went wrong! Let's try again.");
        }
    }

    // Generate a random guess between low and high
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Update range based on user feedback
    public static boolean updateRange(String feedback, int guess, Scanner scanner, int low, int high) {
        if (feedback.equals("c")) {
            System.out.println("Yay! I guessed your number: " + guess + " 🎉");
            return true;
        }
        return false;
    }
}