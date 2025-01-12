import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of digits in the number
        int count = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            count++;
            tempNumber /= 10;  // Remove the last digit
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;  
            tempNumber /= 10;             
        }

        // Create an array to store the digits in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];  
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }

        scanner.close();
    }
}
