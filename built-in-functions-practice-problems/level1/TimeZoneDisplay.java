package level1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {

    public static void main(String[] args) {

        // Formatter for readable output
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        // GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // IST (Asia/Kolkata)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // PST (America/Los_Angeles)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in Different Time Zones\n");

        System.out.println("GMT : " + gmtTime.format(formatter));
        System.out.println("IST : " + istTime.format(formatter));
        System.out.println("PST : " + pstTime.format(formatter));
    }
}
