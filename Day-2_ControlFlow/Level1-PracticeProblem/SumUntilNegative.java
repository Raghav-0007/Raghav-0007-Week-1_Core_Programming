import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        double total = 0.0;  // Variable to store the total sum
        double number;       // Variable to store the user-entered number

        // Taking input from user
        System.out.println("Enter numbers to add to the sum (Enter 0 to stop):");

        // Use a while loop to keep adding numbers until the user enters 0 or Negaive value
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            // Check if the user entered 0 
            if (number == 0 || number<0) {
                break; 
            }

            // Add the entered number to the total
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum of the entered numbers is: " + total);

        // Close the Scanner
        input.close();
    }
}