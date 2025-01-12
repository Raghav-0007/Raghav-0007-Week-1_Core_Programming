import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking weight in pounds as input
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert weight from pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Print the results
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms);

        // Close the Scanner object
        input.close();
    }
}
