import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; 
            }
        }
        
        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
