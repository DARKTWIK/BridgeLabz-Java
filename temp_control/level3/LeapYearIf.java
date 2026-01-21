// Creating Class with name LeapYear indicating the purpose is to 
// check whether a given year is a Leap Year or not using a single if condition
import java.util.Scanner;

class LeapYearIf {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int year = input.nextInt();

      // Check for valid Gregorian calendar year
      if (year >= 1582) {

         // Single if condition using logical operators
         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a Leap Year");
         } else {
            System.out.println("The year " + year + " is not a Leap Year");
         }

      } else {

         // Invalid year for Gregorian calendar
         System.out.println("The year " + year + " is not valid. Enter a year >= 1582");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
