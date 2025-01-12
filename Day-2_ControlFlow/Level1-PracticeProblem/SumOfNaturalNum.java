import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking nuber from user
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the entered number is a natural number
        if (n > 0) {
            // Calculate sum using the formula:
            int sumUsingFormula = n * (n + 1) / 2;

            // Calculate sum using a while loop
            int sumUsingLoop = 0;
            int i = 1;

            while (i <= n) {
                sumUsingLoop += i;
                i++;
            }

            // Display the results
            System.out.println("Sum using formula: " + sumUsingFormula);
            System.out.println("Sum using while loop: " + sumUsingLoop);

            // Compare the two results
            if (sumUsingFormula == sumUsingLoop) {
                System.out.println("Both results are correct and match.");
            } else {
                System.out.println("The results do not match");
            }
        } else {
            // If the input is not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }

        // Close the Scanner
        input.close();
    }
}
