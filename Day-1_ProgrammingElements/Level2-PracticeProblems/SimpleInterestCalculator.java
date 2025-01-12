import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest in % ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time in years: ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the results
        System.out.println("The Simple Interest is INR " + simpleInterest + 
                           " for Principal INR " + principal + 
                           ", Rate of Interest " + rate + "%, and Time " + time + " years.");

        // Close the Scanner object
        input.close();
    }
}
