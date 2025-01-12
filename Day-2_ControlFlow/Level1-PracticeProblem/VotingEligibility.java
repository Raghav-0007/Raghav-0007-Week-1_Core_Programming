import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the person's age: ");
        int age = input.nextInt();

        // Check if the person is eligible to vote
        if (age >= 18) {
            // If age is 18 or older, the person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If age is less than 18, the person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the Scanner object
        input.close();
    }
}
