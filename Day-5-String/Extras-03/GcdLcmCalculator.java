import java.util.Scanner;

public class GcdLcmCalculator {

    // Function to get user input
    static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }

    // Function to calculate GCD using Euclidean algorithm
    static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a; // Base case: when remainder becomes 0
        }
        return calculateGCD(b, a % b); // Recursive call
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to display the results
    static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();  // Get user input
        int num1 = numbers[0];
        int num2 = numbers[1];

        int gcd = calculateGCD(num1, num2);  // Calculate GCD
        int lcm = calculateLCM(num1, num2);  // Calculate LCM

        displayResult(num1, num2, gcd, lcm);  // Display the results
    }
}
