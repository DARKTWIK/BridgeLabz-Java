// Creating Class with name HarshadNumberChecker indicating the purpose is to 
// check whether a given number is a Harshad Number or not
import java.util.Scanner;

class HarshadNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Store original number for divisibility check
      int originalNumber = number;

      // Initialize sum of digits to 0
      int sum = 0;

      // Use while loop to find sum of digits
      while (number != 0) {

         // Get last digit
         int digit = number % 10;

         // Add digit to sum
         sum = sum + digit;

         // Remove last digit
         number = number / 10;
      }

      // Check divisibility by sum of digits
      if (sum != 0 && originalNumber % sum == 0) {
         System.out.println("The number " + originalNumber + " is a Harshad Number");
      } else {
         System.out.println("The number " + originalNumber + " is not a Harshad Number");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
