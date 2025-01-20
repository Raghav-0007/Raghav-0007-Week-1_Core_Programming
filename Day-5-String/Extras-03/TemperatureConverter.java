import java.util.Scanner;

public class TemperatureConverter {

    // Function to convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the menu and get user choice
    static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        return scanner.nextInt();
    }

    // Function to perform the temperature conversion
    static void performConversion(int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    public static void main(String[] args) {
        int choice = getUserChoice();  // Get user choice
        performConversion(choice);  // Perform conversion based on choice
    }
}

