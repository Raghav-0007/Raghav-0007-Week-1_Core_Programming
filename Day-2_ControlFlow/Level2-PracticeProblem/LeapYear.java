import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take year input from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is valid 
        if (year >= 1582) {
            // Multiple conditions to check for leap year
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }

        // Close the scanner
        input.close();
    }
}
