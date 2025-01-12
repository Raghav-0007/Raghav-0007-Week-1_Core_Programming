import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Variable to store the greatest factor, initially set to 1
        int greatestFactor = 1;
        
        // Loop from number - 1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if i is a factor of the number
                greatestFactor = i; // Assign i as the greatest factor
                break; // Exit the loop once the greatest factor is found
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        
        // Close the scanner object
        input.close();
    }
}
