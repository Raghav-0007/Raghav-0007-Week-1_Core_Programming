import java.util.Scanner;

public class NumberAnalysis {

    // Check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        scanner.close();
    }
}
