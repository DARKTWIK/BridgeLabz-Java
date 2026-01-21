// Creating Class with name OddEvenPrinter indicating the purpose is to 
// print whether numbers from 1 to a given natural number are odd or even
import java.util.Scanner;

class OddEvenPrinter {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a natural number (positive integer)
      if (number > 0) {

         // Iterate from 1 to the number using for loop
         for (int i = 1; i <= number; i++) {

            // Check if the number is odd or even
            if (i % 2 == 0) {
               System.out.println(i + " is an even number");
            } else {
               System.out.println(i + " is an odd number");
            }
         }

      } else {

         // Print message if not a natural number
         System.out.println("The number " + number + " is not a natural number");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
