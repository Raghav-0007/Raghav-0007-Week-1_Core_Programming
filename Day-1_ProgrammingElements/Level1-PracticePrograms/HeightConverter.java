import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble(); 

        // Convert height in centimeters to inches
        double heightInInches = heightInCm / 2.54;

        // Convert height in inches to feet
        double feet = heightInInches / 12; 

        // Print the results
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + heightInInches);

        // Close the Scanner object
        input.close();
    }
}
