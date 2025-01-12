import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take user input from user
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height in centimeters (cm): ");
        double heightInCm = input.nextDouble();
        
        // Convert height from centimeters to meters
        double heightInMeters = heightInCm / 100;
        
        // Calculate BMI
        double bmi = weight / (heightInMeters * heightInMeters);
        
        // Display the BMI
        System.out.println("Your BMI is: " + bmi);
        
        // Determine the weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a Normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }  
        input.close();
    }
}
