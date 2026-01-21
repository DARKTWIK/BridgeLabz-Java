// Creating Class with name SumUntilZero indicating the purpose is to 
// find the sum of numbers entered by the user until 0 is entered
import java.util.Scanner;

class SumUntilZero {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Initialize total to 0.0
      double total = 0.0;

      // Variable to store user input
      double value;

      // Get first input value
      value = input.nextDouble();

      // Continue loop until user enters 0
      while (value != 0) {
         total = total + value;

         // Ask for next input
         value = input.nextDouble();
      }

      // Display the total
      System.out.println("The total value is " + total);

      // Closing the Scanner Stream
      input.close();
   }
}
