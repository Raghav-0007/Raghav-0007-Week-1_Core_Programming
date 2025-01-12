import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        
        // Initialize maxFactor, factors array, and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find and store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Expand the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        
        // Print the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
