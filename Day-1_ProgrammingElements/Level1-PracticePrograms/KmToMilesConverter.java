import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble(); 

        // Conversion km to miles
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile(s) for the given " + km + " km.");

        // Close the Scanner object
        input.close();
    }
}
