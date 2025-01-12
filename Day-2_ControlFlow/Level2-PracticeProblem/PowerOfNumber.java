import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Take input for the base (number) and exponent (power)
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Variable to store the result, initialized to 1
        int result = 1;
        
        // Run a loop from 1 to power to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;  
        }
        
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
        
        // Close the scanner object
        input.close();
    }
}
