// Creating Class with name DigitCounter indicating the purpose is to 
// count the number of digits in a given integer
import java.util.Scanner;

class DigitCounter {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Initialize count to 0
      int count = 0;

      // Use loop to count digits
      while (number != 0) {

         // Remove last digit
         number = number / 10;

         // Increase count
         count++;
      }

      // Display the result
      System.out.println("The number of digits is " + count);

      // Closing the Scanner Stream
      input.close();
   }
}
