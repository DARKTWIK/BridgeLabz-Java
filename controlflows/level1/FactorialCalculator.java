// Creating Class with name FactorialCalculator indicating the purpose is to 
// find the factorial of a positive integer entered by the user
import java.util.Scanner;

class FactorialCalculator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         int factorial = 1;
         int counter = 1;

         // Compute factorial using while loop
         while (counter <= number) {
            factorial = factorial * counter;
            counter++;
         }

         // Print the result
         System.out.println("The factorial of " + number + " is " + factorial);

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
