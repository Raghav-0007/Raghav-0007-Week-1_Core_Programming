import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];  // [weight, height, BMI]

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            data[i][1] = scanner.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - BMI: %.2f, Status: %s\n", i + 1, data[i][2], getBMIStatus(data[i][2]));
        }

        scanner.close();
    }
}
