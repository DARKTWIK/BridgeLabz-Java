// Creating Class with name DoubleOpt indicating the purpose is to 
// perform arithmetic operations using double values and understand operator precedence
import java.util.Scanner;

class DoubleOpt {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      // Perform operations
      double result1 = a + b * c;   // Multiplication before addition
      double result2 = a * b + c;   // Multiplication before addition
      double result3 = c + a / b;   // Division before addition
      double result4 = a % b + c;   // Modulus before addition

      // Print the results
      System.out.println("The results of Double Operations are " +
                         result1 + ", " + result2 + ", " +
                         result3 + ", and " + result4);

      // Closing the Scanner Stream
      input.close();
   }
}
