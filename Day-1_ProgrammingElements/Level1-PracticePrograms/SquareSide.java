import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the Scanner object
        sc.close();
    }
}
