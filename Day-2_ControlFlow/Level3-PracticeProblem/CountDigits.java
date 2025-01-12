import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize count to 0
        int count = 0;
             
        // Calculate the number of digits
        if (number == 0) {
            count = 1;
        } else {
            
            while (number != 0) {
                
                number /= 10;
               
                count++;
            }
        }
        
        // Display the result
        System.out.println("The number of digits is: " + count);
        
        // Close the scanner
        scanner.close();
    }
}
