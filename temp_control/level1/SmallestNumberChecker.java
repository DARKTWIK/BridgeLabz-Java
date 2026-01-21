// Creating Class with name SmallestNumberChecker indicating the purpose is to 
// check if the first number is the smallest among three numbers
import java.util.Scanner;

class SmallestNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get 3 input values
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();

      // Check if the first number is the smallest
      boolean isSmallest = (number1 < number2) && (number1 < number3);

      // Print the result
      System.out.println("Is the first number the smallest? " + isSmallest);

      // Closing the Scanner Stream
      input.close();
   }
}
