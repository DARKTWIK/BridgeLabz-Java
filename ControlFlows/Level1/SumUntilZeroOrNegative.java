// Creating Class with name SumUntilZeroOrNegative indicating the purpose is to 
// find the sum of numbers entered by the user until 0 or a negative number is entered
import java.util.Scanner;

class SumUntilZeroOrNegative {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Initialize total to 0.0
      double total = 0.0;

      // Variable to store user input
      double value;

      // Infinite loop
      while (true) {

         // Get user input
         value = input.nextDouble();

         // Check for 0 or negative number to stop
         if (value <= 0) {
            break;
         }

         // Add value to total
         total = total + value;
      }

      // Display the total
      System.out.println("The total value is " + total);

      // Closing the Scanner Stream
      input.close();
   }
}
