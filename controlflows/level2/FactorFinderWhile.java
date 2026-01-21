// Creating Class with name FactorFinder indicating the purpose is to 
// find and print all factors of a given positive integer using a while loop
import java.util.Scanner;

class FactorFinderWhile {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         System.out.println("Factors of " + number + " are:");

         // Initialize counter
         int counter = 1;

         // Find factors using while loop
         while (counter < number) {

            if (number % counter == 0) {
               System.out.println(counter);
            }

            counter++;
         }

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
