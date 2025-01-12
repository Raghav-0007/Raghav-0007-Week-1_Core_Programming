import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];  
        double total = 0.0;               
        int index = 0;             

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break if input is 0, negative, or array is full
            if (input <= 0 || index == 10) {
                break;
            }

            // Store input in the array and increment index
            numbers[index] = input;
            index++;
        }

        // Calculate the sum of entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display entered numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display the total sum
        System.out.println("\nSum of the numbers: " + total);

        scanner.close();
    }
}

