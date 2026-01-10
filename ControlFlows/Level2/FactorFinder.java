// Creating Class with name FactorFinder indicating the purpose is to 
// find and print all factors of a given positive integer
import java.util.Scanner;

class FactorFinder {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         System.out.println("Factors of " + number + " are:");

         // Find factors using for loop
         for (int i = 1; i < number; i++) {

            if (number % i == 0) {
               System.out.println(i);
            }
         }

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
