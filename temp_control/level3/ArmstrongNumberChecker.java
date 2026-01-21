// Creating Class with name ArmstrongNumberChecker indicating the purpose is to 
// check whether a given number is an Armstrong number or not
import java.util.Scanner;

class ArmstrongNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Initialize sum to 0
      int sum = 0;

      // Store original number for comparison
      int originalNumber = number;

      // Use while loop to process each digit
      while (originalNumber != 0) {

         // Get last digit using modulus operation
         int digit = originalNumber % 10;

         // Find cube of the digit and add to sum
         sum = sum + (digit * digit * digit);

         // Remove last digit by division
         originalNumber = originalNumber / 10;
      }

      // Check if the sum is equal to the original number
      if (sum == number) {
         System.out.println("The number " + number + " is an Armstrong number");
      } else {
         System.out.println("The number " + number + " is not an Armstrong number");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
