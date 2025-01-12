import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate the bonus based on years of service
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }

        // Output the bonus amount
        if (bonus > 0) {
            System.out.println("The employee's bonus is: INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the scanner
        input.close();
    }
}
