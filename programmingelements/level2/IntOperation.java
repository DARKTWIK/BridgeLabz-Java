// Creating Class with name IntOperation indicating the purpose is to 
// perform integer operations and understand operator precedence
import java.util.Scanner;

class IntOperation {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      // Perform integer operations
      int result1 = a + b * c;     // Multiplication before addition
      int result2 = a * b + c;     // Multiplication before addition
      int result3 = c + a / b;     // Division before addition
      int result4 = a % b + c;     // Modulus before addition

      // Print the results
      System.out.println("The results of Int Operations are " +
                         result1 + ", " + result2 + ", " +
                         result3 + ", and " + result4);

      // Closing the Scanner Stream
      input.close();
   }
}
