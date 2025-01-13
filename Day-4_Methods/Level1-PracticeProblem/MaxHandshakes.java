import java.util.Scanner;

public class MaxHandshakes {

    // Method to calculate maximum handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Handle negative or invalid input
        if (n < 0) {
            System.out.println("Number of students cannot be negative.");
        } else {
            // Calculate and display the result
            int maxHandshakes = calculateHandshakes(n);
            System.out.println("Maximum number of handshakes: " + maxHandshakes);
        }

        scanner.close();
    }
}


