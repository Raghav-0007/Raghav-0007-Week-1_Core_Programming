import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        // Close the Scanner object
        sc.close();
    }
}
