import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Create a scanner object for taking user input
        Scanner input = new Scanner(System.in);
        
        // Take the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Boolean variable to store if the number is prime
        boolean isPrime = true;
        
        // Check if the number is less than 2
        if (number <= 1) {
            isPrime = false; 
        } else {
            // Loop  to check divisibility
            for (int i = 2; i <= Math.sqrt(number); i++) {
               
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the scanner object
        input.close();
    }
}
