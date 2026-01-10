// Creating Class with name TriangleAreaCalculator indicating the purpose is to 
// calculate the area of a triangle in square inches and square centimeters
import java.util.Scanner;

class TriangleAreaCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values (in inches)
      double base = input.nextDouble();
      double height = input.nextDouble();

      // Calculate area in square inches
      double areaInches = 0.5 * base * height;

      // Convert area to square centimeters
      double areaCm = areaInches * 6.4516;

      // Print the result
      System.out.println("The area of the triangle is " + areaInches +
                         " square inches and " + areaCm + " square centimeters");

      // Closing the Scanner Stream
      input.close();
   }
}
