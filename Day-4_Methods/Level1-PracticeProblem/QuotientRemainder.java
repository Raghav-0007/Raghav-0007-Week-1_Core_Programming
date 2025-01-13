import java.util.Scanner;

public class QuotientRemainder {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
		
		// scanner class object for taking input
        Scanner scanner = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter dividend: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

         // print the result
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        scanner.close();
    }
}
