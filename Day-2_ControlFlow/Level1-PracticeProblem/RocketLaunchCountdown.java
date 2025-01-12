import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter + "...");
            counter--;  // Decrement the counter
        }

        // Print launch message after countdown
        System.out.println("Liftoff!");

        // Close the Scanner
        input.close();
    }
}
