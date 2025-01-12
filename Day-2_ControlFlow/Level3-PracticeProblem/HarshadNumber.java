import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number in a variable
        int originalNumber = number;
        
        // Variable to store the sum of digits
        int sum = 0;
        
        // Loop to sum the digits of the number
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum
            number /= 10;         // Remove the last digit
        }
        
        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
