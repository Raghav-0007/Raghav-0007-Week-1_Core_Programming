import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangular park
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(double perimeter) {
        double totalDistance = 5000; // 5 km in meters
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the three sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Validate if the sides form a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Calculate the perimeter
            double perimeter = calculatePerimeter(side1, side2, side3);

            // Calculate the required number of rounds
            int rounds = calculateRounds(perimeter);

            // Display the result
            System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
        } else {
            System.out.println("The provided sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
