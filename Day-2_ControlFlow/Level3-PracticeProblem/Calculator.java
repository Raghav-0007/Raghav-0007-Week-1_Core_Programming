import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create Scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);
        
        double first, second;
        String op;

        // Taking input from user
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        System.out.print("Enter second number: ");
        second = scanner.nextDouble();

        // Perform operation
        double result;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("The result of " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("The result of " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("The result of " + first + " * " + second + " = " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("The result of " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator. Please enter one of +, -, *, /.");
        }

        
        scanner.close();
    }
}
