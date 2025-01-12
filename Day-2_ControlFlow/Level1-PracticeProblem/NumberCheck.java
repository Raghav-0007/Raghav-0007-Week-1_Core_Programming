import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner object
        input.close();
    }
}
