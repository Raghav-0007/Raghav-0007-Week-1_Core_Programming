import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Print the results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

        // Close the Scanner object
        sc.close();
    }
}
