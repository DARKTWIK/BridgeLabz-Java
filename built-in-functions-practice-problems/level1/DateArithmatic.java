package level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmatic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a date (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();

            LocalDate date = LocalDate.parse(inputDate);

            System.out.println("\nOriginal Date       : " + date);

            // Add 7 days
            LocalDate afterDays = date.plusDays(7);
            System.out.println("After adding 7 days : " + afterDays);

            // Add 1 month
            LocalDate afterMonth = afterDays.plusMonths(1);
            System.out.println("After adding 1 month: " + afterMonth);

            // Add 2 years
            LocalDate afterYears = afterMonth.plusYears(2);
            System.out.println("After adding 2 years: " + afterYears);

            // Subtract 3 weeks
            LocalDate finalDate = afterYears.minusWeeks(3);
            System.out.println("After subtracting 3 weeks: " + finalDate);

        } catch (Exception exception) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}

