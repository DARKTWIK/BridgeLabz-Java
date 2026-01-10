// Creating Class with name NaturalNumberSumChecker indicating the purpose is to 
// check if a number is a natural number and find the sum of n natural numbers
import java.util.Scanner;

class NaturalNumberSumChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a natural number (positive integer)
      if (number > 0) {

         // Calculate the sum of n natural numbers using the formula n * (n + 1) / 2
         int sumOfNaturalNumbers = number * (number + 1) / 2;

         // Print the result
         System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);

      } else {

         // Print message if not a natural number
         System.out.println("The number " + number + " is not a natural number");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
