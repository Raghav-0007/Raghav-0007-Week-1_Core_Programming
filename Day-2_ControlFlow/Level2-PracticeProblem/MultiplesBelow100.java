import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Print multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        
        // Loop from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {  
                System.out.println(i); 
            }
        }
        
        // Close the scanner object
        input.close();
    }
}
