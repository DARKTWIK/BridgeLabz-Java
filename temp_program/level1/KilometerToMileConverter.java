// Creating Class with name KilometerToMileConverter indicating the purpose is to 
// convert distance from kilometers to miles
import java.util.Scanner;

class KilometerToMileConverter {
   public static void main(String[] args) {

      // Declare variable for kilometers
      double km;

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input for kilometers
      km = input.nextDouble();

      // Convert kilometers to miles using formula
      double miles = km / 1.6;

      // Print the result
      System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

      // Closing the Scanner Stream
      input.close();
   }
}
