// Creating Class with name NumberSignChecker indicating the purpose is to 
// check whether a number is positive, negative, or zero
import java.util.Scanner;

class NumberSignChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check the sign of the number
      if (number > 0) {
         System.out.println("positive");
      } else if (number < 0) {
         System.out.println("negative");
      } else {
         System.out.println("zero");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
