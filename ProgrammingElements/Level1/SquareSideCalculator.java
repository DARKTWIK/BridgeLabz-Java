// Creating Class with name SquareSideCalculator indicating the purpose is to 
// calculate the side length of a square from its perimeter
import java.util.Scanner;

class SquareSideCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input for perimeter
      double perimeter = input.nextDouble();

      // Calculate side of the square
      double side = perimeter / 4;

      // Print the result
      System.out.println("The length of the side is " + side +
                         " whose perimeter is " + perimeter);

      // Closing the Scanner Stream
      input.close();
   }
}
