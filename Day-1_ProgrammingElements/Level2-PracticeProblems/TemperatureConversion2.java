import java.util.Scanner;

public class TemperatureConversion2 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius.");

        // Close the Scanner object
        sc.close();
    }
}