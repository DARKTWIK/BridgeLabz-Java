// Creating Class with name PowerCalculator indicating the purpose is to 
// calculate the power of a number using a loop
import java.util.Scanner;

class PowerCalculator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      int number = input.nextInt();
      int power = input.nextInt();

      // Check if both inputs are positive integers
      if (number > 0 && power > 0) {

         // Initialize result to 1
         int result = 1;

         // Compute power using for loop
         for (int i = 1; i <= power; i++) {
            result = result * number;
         }

         // Print the result
         System.out.println(number + " raised to the power of " + power + " is " + result);

      } else {

         // Print message if inputs are not positive integers
         System.out.println("Both number and power should be positive integers");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
