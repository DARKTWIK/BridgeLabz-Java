// Creating Class with name AbundantNumberChecker indicating the purpose is to 
// check whether a given number is an Abundant Number or not
import java.util.Scanner;

class AbundantNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Initialize sum of divisors to 0
      int sum = 0;

      // Check only for positive integers
      if (number > 0) {

         // Find sum of proper divisors using for loop
         for (int i = 1; i < number; i++) {

            if (number % i == 0) {
               sum = sum + i;
            }
         }

         // Check if number is abundant
         if (sum > number) {
            System.out.println("The number " + number + " is an Abundant Number");
         } else {
            System.out.println("The number " + number + " is not an Abundant Number");
         }

      } else {

         // Invalid input case
         System.out.println("The number " + number + " is not a valid positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
