import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a scanner object for taking user input
        Scanner input = new Scanner(System.in);
        
        // Take the number from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            
            for (int i = 1; i <= number; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check for multiples of 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check for multiples of 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // For other numbers, print the number itself
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        // Close the scanner object
        input.close();
    }
}
