import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
		
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Parse the command-line arguments
        int month = sc.nextInt();
        int day = sc.nextInt();

        // Check if the date falls in the Spring Season (March 20 to June 20)
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||  // March 20–31
                           (month == 4 && day >= 1 && day <= 30)  ||  // April 1–30
                           (month == 5 && day >= 1 && day <= 31)  ||  // May 1–31
                           (month == 6 && day >= 1 && day <= 20);     // June 1–20

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
