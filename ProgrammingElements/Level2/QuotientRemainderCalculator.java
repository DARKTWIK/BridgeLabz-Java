// Creating Class with name QuotientRemainderCalculator indicating the purpose is to 
// calculate quotient and remainder of two numbers
import java.util.Scanner;

class QuotientRemainderCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      int number1 = input.nextInt();
      int number2 = input.nextInt();

      // Check to avoid division by zero
      if (number2 != 0) {

         // Calculate quotient and remainder
         int quotient = number1 / number2;
         int remainder = number1 % number2;

         // Print the result
         System.out.println("The Quotient is " + quotient +
                            " and Reminder is " + remainder +
                            " of two number " + number1 +
                            " and " + number2);

      } else {

         System.out.println("Division by zero is not allowed");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
