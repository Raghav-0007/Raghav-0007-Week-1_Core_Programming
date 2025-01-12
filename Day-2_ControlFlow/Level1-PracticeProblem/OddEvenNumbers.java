import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Use a for loop to iterate from 1 to the entered number
            System.out.println("Odd numbers between 1 and " + number + " are:");
            for (int i = 1; i <= number; i++) {
                // Check if the number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // Close the scanner
        input.close();
    }
}
