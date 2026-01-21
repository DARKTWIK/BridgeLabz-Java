// Creating Class with name AthleteRoundsCalculator indicating the purpose is to 
// calculate the number of rounds required to complete 5 km in a triangular park
import java.util.Scanner;

class AtheleteRoundsCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values for sides of triangle (in meters)
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();

      // Calculate perimeter of the triangular park
      double perimeter = side1 + side2 + side3;

      // Total distance to run = 5 km = 5000 meters
      double totalDistance = 5000;

      // Calculate number of rounds
      double rounds = totalDistance / perimeter;

      // Print the result
      System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

      // Closing the Scanner Stream
      input.close();
   }
}
