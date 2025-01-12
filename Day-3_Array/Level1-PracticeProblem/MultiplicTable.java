import java.util.Scanner;

public class MultiplicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] table = new int[10];

        // Calculate and store the multiplication results
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        scanner.close();
    }
}
