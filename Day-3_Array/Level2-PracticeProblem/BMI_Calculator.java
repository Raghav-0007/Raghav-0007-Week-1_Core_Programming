import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create arrays to store weight, height, BMI, and weight status of the persons
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        // Take input for weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Calculate BMI and weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);  // BMI formula
            // Determine weight status based on BMI
            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI and Weight Status of Persons:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " meters");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + String.format("%.2f", bmis[i]));
            System.out.println("Weight Status: " + weightStatuses[i]);
        }

        scanner.close();
    }
}
