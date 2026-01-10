// Creating Class with name GreatestFactorFinder indicating the purpose is to 
// find the greatest factor of a number other than the number itself
import java.util.Scanner;

class GreatestFactorFinder {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         // Initialize greatest factor to 1
         int greatestFactor = 1;

         // Loop from number - 1 down to 1
         for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
               greatestFactor = i;
               break;
            }
         }

         // Display the greatest factor
         System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
