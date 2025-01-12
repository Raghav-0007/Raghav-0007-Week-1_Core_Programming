import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number to be checked
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number for comparison
        int originalNumber = number;
        int sum = 0;
        
        // Calculate armstrong number
        while (number != 0) {
 
            int digit = number % 10;
   
            sum += digit * digit * digit;
         
            number /= 10;
        }
        
        // Check if the sum of cubes of digits equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
