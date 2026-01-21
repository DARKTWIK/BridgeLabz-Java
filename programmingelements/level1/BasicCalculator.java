// Creating Class with name BasicCalculator indicating the purpose is to 
// perform addition, subtraction, multiplication, and division on two numbers
import java.util.Scanner;

class BasicCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();

      // Perform arithmetic operations
      double addition = number1 + number2;
      double subtraction = number1 - number2;
      double multiplication = number1 * number2;
      double division = number1 / number2;

      // Print the result
      System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                         + number1 + " and " + number2 + " is " 
                         + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

      // Closing the Scanner Stream
      input.close();
   }
}
