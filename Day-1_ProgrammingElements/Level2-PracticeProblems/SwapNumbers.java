import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Print the original numbers
        System.out.println("Before swapping: Number1 = " + number1 + ", Number2 = " + number2);

        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("After swapping: Number1 = " + number1 + ", Number2 = " + number2);

        // Close the Scanner object
        sc.close();
    }
}
