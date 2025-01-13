import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
		
		// scanner class object for taking input
        Scanner scanner = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        // print the result
        System.out.println("Sum of first " + n + " natural numbers is: " + findSum(n));
        scanner.close();
    }
}
