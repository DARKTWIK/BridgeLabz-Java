// Creating Class with name DistanceConverter indicating the purpose is to 
// convert distance from feet to yards and miles
import java.util.Scanner;

class DistanceConverterFeet {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input for distance in feet
      double distanceInFeet = input.nextDouble();

      // Convert feet to yards
      double distanceInYards = distanceInFeet / 3;

      // Convert yards to miles
      double distanceInMiles = distanceInYards / 1760;

      // Print the result
      System.out.println("The distance in feet is " + distanceInFeet +
                         " while in yards is " + distanceInYards +
                         " and miles is " + distanceInMiles);

      // Closing the Scanner Stream
      input.close();
   }
}
