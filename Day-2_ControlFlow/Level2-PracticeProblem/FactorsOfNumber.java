import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        
        // Loop through numbers from 1 to number - 1
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  
                System.out.println(i); 
            }
        }
        
        // Close the scanner object
        input.close();
    }
}
