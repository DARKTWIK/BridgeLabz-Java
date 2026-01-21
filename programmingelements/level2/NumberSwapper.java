// Creating Class with name NumberSwapper indicating the purpose is to 
// swap two numbers entered by the user
import java.util.Scanner;

class NumberSwapper {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      int number1 = input.nextInt();
      int number2 = input.nextInt();

      // Swap using a temporary variable
      int temp = number1;
      number1 = number2;
      number2 = temp;

      // Print swapped values
      System.out.println("The swapped numbers are " + number1 + " and " + number2);

      // Closing the Scanner Stream
      input.close();
   }
}
