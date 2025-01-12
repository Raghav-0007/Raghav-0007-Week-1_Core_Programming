import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

// Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Take input from user
        System.out.print("Enter a number: ");
  
        // Taking input from user
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        // Calculate y0, x, m0, and d0 using the provided formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Output the day of the week
        System.out.println("The day of the week is: " + d0);
    }
}
