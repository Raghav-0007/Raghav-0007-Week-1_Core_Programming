import java.util.Scanner;
import java.time.*;

// Create a class for perform arithmatic operatins on date
public class DateArithmetic {
    public static void main(String[] args) {
        // Creaet a scnner class object for taking input
        Scanner sc = new Scanner(System.in);

        // take date as input
        String inputDate = sc.nextLine();

        // parse the date and print
        LocalDate date = LocalDate.parse(inputDate);
        System.out.println(date);

        // addition in date
        date = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println(date);

        // subtraction in date
        date = date.minusWeeks(3);
        System.out.println(date);

        sc.close();
    }
}
