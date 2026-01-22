package level3;

import java.util.Scanner;

public class MonthlyCalendarPrinter {

    /* Month names */
    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    /* Days in each month (non-leap year) */
    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    /* Get month name */
    public static String getMonthName(int month) {
        return MONTH_NAMES[month - 1];
    }

    /* Check leap year */
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    /* Get number of days in month */
    public static int getDaysInMonth(int month, int year) {

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return DAYS_IN_MONTH[month - 1];
    }

    /* Get first day of month using Gregorian algorithm */
    public static int getFirstDayOfMonth(int month, int year) {

        int d = 1;
        int m = month;
        int y = year;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // 0 = Sunday, 1 = Monday, ...
    }

    /* Display calendar */
    public static void displayCalendar(int month, int year) {

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("\n        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        /* First loop – indentation */
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        /* Second loop – print days */
        for (int day = 1; day <= days; day++) {

            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            displayCalendar(month, year);

        } catch (Exception exception) {
            System.err.println("Invalid input. Please enter numeric values.");
        }
    }
}

