// Creating Class with name Calculator indicating the purpose is to 
// perform basic arithmetic operations using switch...case
import java.util.Scanner;

class Calculator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double first = input.nextDouble();
      double second = input.nextDouble();
      String op = input.next();

      double result;

      // Perform operation using switch-case
      switch (op) {

         case "+":
            result = first + second;
            System.out.println("Result = " + result);
            break;

         case "-":
            result = first - second;
            System.out.println("Result = " + result);
            break;

         case "*":
            result = first * second;
            System.out.println("Result = " + result);
            break;

         case "/":
            if (second != 0) {
               result = first / second;
               System.out.println("Result = " + result);
            } else {
               System.out.println("Division by zero is not allowed");
            }
            break;

         default:
            System.out.println("Invalid Operator");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
