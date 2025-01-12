import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }
        
        // Define arrays for odd and even numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Separate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }
        
        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
        
        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
