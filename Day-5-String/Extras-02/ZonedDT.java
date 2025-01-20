import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZonedDT {

    public static void main(String[] args) {
        // Zoned Date and Time for different time zones
        ZonedDateTime gmtDT = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istDT = ZonedDateTime.now(ZoneId.of(("Asia/Kolkata")));
        ZonedDateTime pstDT = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Date time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss z");

        // Print the date and time
        System.out.println(gmtDT.format(formatter));
        System.out.println(istDT.format(formatter));
        System.out.println(pstDT.format(formatter));
    }
}