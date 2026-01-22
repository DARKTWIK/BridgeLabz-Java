package level2;

import java.util.Scanner;

/*
 * Program Name : LeapYearChecker
 * Description  : Checks whether a given year is a leap year or not
 *                based on Gregorian calendar rules
 */
class LeapYearChecker {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);
        int year = 0;

        /* ---------------- User Input & Validation ---------------- */

        System.out.print("Enter a year: ");

        if (!scanner.hasNextInt()) {
            System.err.println("Error: Invalid input. Please enter a valid year.");
            scanner.close();
            System.exit(0);
        }

        year = scanner.nextInt();

        if (year < 1582) {
            System.err.println("Error: Year must be 1582 or later (Gregorian calendar).");
            scanner.close();
            System.exit(0);
        }

        /* ---------------- Leap Year Check ---------------- */

        boolean isLeapYear = checkLeapYear(year);

        /* ---------------- Display Result ---------------- */

        if (isLeapYear) {
            System.out.println("Year " + year + " is a Leap Year.");
        } else {
            System.out.println("Year " + year + " is not a Leap Year.");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : checkLeapYear
     * Description  : Determines if a year is a leap year
     * Conditions   :
     *   1. Divisible by 4 AND not divisible by 100
     *   2. OR divisible by 400
     */
    public static boolean checkLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }
}

