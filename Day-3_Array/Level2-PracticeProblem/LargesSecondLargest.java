import java.util.Scanner;

public class LargesSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store digits, maxDigit is initially set to 10
        int[] digits = new int[10];
        int index = 0;
        int maxDigit = 10;

        // Extract digits of the number and store them in the array
        while (number != 0) {
            // If the index equals maxDigit, increase the size of the array
            if (index == maxDigit) {
                maxDigit += 10;  // Increase size by 10
                // Create a new temporary array of the increased size
                int[] temp = new int[maxDigit];
                
                // Copy elements from the old digits array to the new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                
                // Assign the new temp array to the digits array
                digits = temp;
            }

            digits[index] = number % 10;  // Get the last digit
            number /= 10;                  // Remove the last digit
            index++;                        // Increment the index
        }

        // Variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // Loop through the array to find the largest and second-largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;  // Update second largest
                largest = digits[i];      // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];  // Update second largest if the digit is not equal to largest
            }
        }

        // Output the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}
