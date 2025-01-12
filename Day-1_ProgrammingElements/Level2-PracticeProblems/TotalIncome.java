import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // taking salary and bonus as input
        System.out.print("Enter the salary ");
        double salary = sc.nextDouble();

        System.out.print("Enter the bonus ");
        double bonus = sc.nextDouble();

        // Calculate the total income
        double totalIncome = salary + bonus;

        // Print the results
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);

        // Close the Scanner object
        sc.close();
    }
}
