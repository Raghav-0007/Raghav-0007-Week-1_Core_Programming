import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert feet to miles 
        double distanceInMiles = distanceInYards / 1760;

        // Print the results
        System.out.println("The distance in yards is: " + distanceInYards);
        System.out.println("The distance in miles is: " + distanceInMiles);

        // Close the Scanner object
        sc.close();
    }
}
