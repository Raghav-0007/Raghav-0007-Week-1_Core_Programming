import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Array to store the digits of the number
        int[] digits = new int[10];
        int[] frequency = new int[10];

        // Extract digits from the number and store in the digits array
        while (number != 0) {
            int digit = (int)(number % 10);  
            digits[digit]++;  
            number = number / 10;  
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {  
                System.out.println("Digit " + i + ": " + digits[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
