import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        maxOfNumber(sc);
    }

    // method to take inputs
    public static void maxOfNumber(Scanner sc) {
        System.out.print("Enter 1 nunber: ");
        int a = sc.nextInt();
        System.out.print("Enter 2 nunber: ");
        int b = sc.nextInt();
        System.out.print("Enter 3 nunber: ");
        int c = sc.nextInt();

        // calling the
        int mn = maxNum(a, b, c);
        System.out.println("max is: " + mn);
    }

    // method to calculate the max of given three numbers
    public static int maxNum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
