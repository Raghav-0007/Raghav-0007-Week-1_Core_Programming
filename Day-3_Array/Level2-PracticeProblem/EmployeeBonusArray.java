import java.util.Scanner;

public class EmployeeBonusArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define arrays to hold salary and years of service for each employee
        double[] salaries = new double[10];
        int[] yearsOfService = new int[10];
        
        // Define arrays for the bonus amount, new salary for each employee
        double[] bonus = new double[10];
        double[] newSalaries = new double[10];
        
        // Variables to hold total bonus, total old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        // Taking input for the salary and years of service for each employee
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salaries[i] = scanner.nextDouble();
                
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = scanner.nextInt();
                
                // Validate inputs: salary must be positive, years of service must be non-negative
                if (salaries[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter valid salary and years of service.");
                } else {
                    validInput = true;
                }
            }
        }

        // Loop to calculate bonus, new salary, and totals
        for (int i = 0; i < 10; i++) {
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salaries[i] * 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonus[i] = salaries[i] * 0.02; // 2% bonus for employees with 5 or fewer years of service
            }

            // Calculate new salary
            newSalaries[i] = salaries[i] + bonus[i];

            // Calculate total bonus, total old salary, and total new salary
            totalBonus += bonus[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output the results
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salaries: " + totalOldSalary);
        System.out.println("Total New Salaries: " + totalNewSalary);

        // Close the scanner
        scanner.close();
    }
}
