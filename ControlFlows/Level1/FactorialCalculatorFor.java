// Creating Class with name FactorialCalculator indicating the purpose is to 
// find the factorial of a positive integer entered by the user using a for loop
import java.util.Scanner;

class FactorialCalculatorFor {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a natural number (positive integer)
      if (number > 0) {

         int factorial = 1;

         // Compute factorial using for loop
         for (int counter = 1; counter <= number; counter++) {
            factorial = factorial * counter;
         }

         // Print the result
         System.out.println("The factorial of " + number + " is " + factorial);

      } else {

         // Print message if not a natural number
         System.out.println("The number " + number + " is not a natural number");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
