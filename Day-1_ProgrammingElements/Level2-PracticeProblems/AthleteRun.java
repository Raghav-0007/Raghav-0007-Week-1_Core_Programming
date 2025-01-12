import java.util.Scanner;

public class AthleteRun {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the length of side1 in meters: ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of side2 in meters: ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of side3 in meters: ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Convert the total distance to meters
        double totalDistance = 5000;

        // Calculate the number of rounds required
        int rounds = (int) (totalDistance / perimeter);

        // Print the results
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");

        // Close the Scanner object
        input.close();
    }
}
