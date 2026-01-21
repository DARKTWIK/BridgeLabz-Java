// Creating Class with name LargestNumberChecker indicating the purpose is to 
// check which number is the largest among three numbers
import java.util.Scanner;

class LargestNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get 3 input values
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();

      // Check which number is the largest
      boolean isFirstLargest  = (number1 > number2) && (number1 > number3);
      boolean isSecondLargest = (number2 > number1) && (number2 > number3);
      boolean isThirdLargest  = (number3 > number1) && (number3 > number2);

      // Print the results
      System.out.println("Is the first number the largest? " + isFirstLargest);
      System.out.println("Is the second number the largest? " + isSecondLargest);
      System.out.println("Is the third number the largest? " + isThirdLargest);

      // Closing the Scanner Stream
      input.close();
   }
}
