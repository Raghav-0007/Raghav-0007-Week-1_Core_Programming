import java.util.Scanner;

public class BMI_Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Create a multi-dimensional array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPersons][3];  // personData[i][0] = weight, personData[i][1] = height, personData[i][2] = BMI
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Input for weight (positive value)
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;  // Store the weight

            // Input for height (positive value)
            double height;
            do {
                System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            personData[i][1] = height;  // Store the height
        }

        // Calculate BMI and weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // BMI formula: BMI = weight / (height^2)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);  // Store the BMI

            // Determine weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\nBMI and Weight Status of Persons:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
