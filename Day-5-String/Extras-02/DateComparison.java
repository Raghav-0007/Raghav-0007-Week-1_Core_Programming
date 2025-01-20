import java.time.*;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {

        // create a scanner class object
        Scanner sc = new Scanner(System.in);

        // taking dates as input
        System.out.println("Enter the first date");
        String fDate=sc.nextLine();
        System.out.println("Enter the second date");
        String sDate=sc.nextLine();

        // parse the dates string in local date
        LocalDate date1=LocalDate.parse(fDate);
        LocalDate date2=LocalDate.parse(sDate);

        // perform the isBefore, isAfter and isEqual
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isEqual(date2));

        sc.close();
    }
}
