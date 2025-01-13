import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || 
               (month == 4) || 
               (month == 5) || 
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
		// scanner class object for taking input
        Scanner scanner = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // print the result
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        scanner.close();
    }
}
