import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // get the current date
        LocalDate date = LocalDate.now();

        // Date formate patterns
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // formate pattern -1
        System.out.println("Date in formate 1:");
        System.out.println(date.format(formatter1));

        // formate pattern -2
        System.out.println("Date in formate 2:");
        System.out.println(date.format(formatter2));

        // formate pattern -3
        System.out.println("Date in formate 3:");
        System.out.println(date.format(formatter3));
    }
}
