// Creating Class with name DayOfWeek indicating the purpose is to
// find the day of the week for a given date using Gregorian calendar formulas

import java.util.Scanner;

class DayOfWeek {
   public static void main(String[] args) {

      // Create Scanner object
      Scanner input = new Scanner(System.in);

      // Read input values
      int m = input.nextInt(); // month (1 = Jan, 2 = Feb, ...)
      int d = input.nextInt(); // day
      int y = input.nextInt(); // year

      // Validate Gregorian calendar year
      if (y < 1582 || m < 1 || m > 12 || d < 1 || d > 31) {
         System.out.println("Invalid date input");
         input.close();
         return;
      }

      // Step 1: Calculate adjusted year
      int y0 = y - (14 - m) / 12;

      // Step 2: Calculate x value
      int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

      // Step 3: Calculate adjusted month
      int m0 = m + 12 * ((14 - m) / 12) - 2;

      // Step 4: Calculate day of week number
      int d0 = (d + x + (31 * m0) / 12) % 7;

      // Step 5: Map number to day name
      System.out.print("Day of the week: ");

      switch (d0) {
         case 0:
            System.out.println("Sunday");
            break;
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         default:
            System.out.println("Invalid calculation");
      }

      // Close Scanner
      input.close();
   }
}

