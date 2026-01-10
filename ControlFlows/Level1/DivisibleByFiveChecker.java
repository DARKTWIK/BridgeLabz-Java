// Creating Class with name DivisibleByFiveChecker indicating the purpose is to 
// check if a number is divisible by 5
import java.util.Scanner;

class DivisibleByFiveChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for the number
      int number = input.nextInt();

      // Check if the number is divisible by 5
      boolean isDivisible = (number % 5 == 0);

      // Print the result
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

      // Closing the Scanner Stream
      input.close();
   }
}
