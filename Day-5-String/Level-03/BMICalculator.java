import java.util.Scanner;

public class BMICalculator {

    // Method to take user input for weight and height
    public static double[][] inputHeightWeight(int n) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[n][2]; // [Weight, Height]

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter weight (kg) for person %d: ", i + 1);
            data[i][0] = scanner.nextDouble();
            System.out.printf("Enter height (cm) for person %d: ", i + 1);
            data[i][1] = scanner.nextDouble();
        }
        return data;
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // [Weight, Height, BMI, Status]

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            bmi = Math.round(bmi * 100.0) / 100.0;

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    // Method to determine BMI status
    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the BMI table
    public static void displayBMITable(String[][] data) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 10; // Number of team members
        double[][] heightWeightData = inputHeightWeight(n);
        String[][] bmiResults = calculateBMI(heightWeightData);
        displayBMITable(bmiResults);
    }
}
