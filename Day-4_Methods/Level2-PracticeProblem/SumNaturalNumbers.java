import java.util.Scanner;

public class SumNaturalNumbers {

    // Recursive method to calculate sum
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method to calculate sum
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Enter a natural number.");
            return;
        }

        int recursiveResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);
        scanner.close();
    }
}
