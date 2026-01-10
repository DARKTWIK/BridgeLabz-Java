// Creating Class with name NaturalNumberSumVerifier indicating the purpose is to 
// compute the sum of n natural numbers using a while loop and a formula and 
// verify whether both results are the same
import java.util.Scanner;

class NaturalNumberSumVerifier {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int n = input.nextInt();

      // Check if n is a natural number (positive integer)
      if (n > 0) {

         // Compute sum using while loop
         int sumUsingLoop = 0;
         int counter = 1;

         while (counter <= n) {
            sumUsingLoop = sumUsingLoop + counter;
            counter++;
         }

         // Compute sum using formula n * (n + 1) / 2
         int sumUsingFormula = n * (n + 1) / 2;

         // Print both results
         System.out.println("Sum using while loop: " + sumUsingLoop);
         System.out.println("Sum using formula: " + sumUsingFormula);

         // Compare and print verification result
         if (sumUsingLoop == sumUsingFormula) {
            System.out.println("Both computations are correct and equal.");
         } else {
            System.out.println("The computations are not equal.");
         }

      } else {

         // Print message if not a natural number
         System.out.println("The number " + n + " is not a natural number");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
