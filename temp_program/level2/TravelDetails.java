// Creating Class with name TravelDetails indicating the purpose is to
// calculate total distance and average speed using user inputs
import java.util.Scanner;

class TravelDetails {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input for name and cities
      String name = input.nextLine();
      String fromCity = input.nextLine();
      String viaCity = input.nextLine();
      String toCity = input.nextLine();

      // Get distances in miles
      double fromToVia = input.nextDouble();
      double viaToFinalCity = input.nextDouble();

      // Get time taken in hours
      double timeTaken = input.nextDouble();

      // Calculate total distance (operator precedence: + first)
      double totalDistance = fromToVia + viaToFinalCity;

      // Calculate average speed (division after addition)
      double averageSpeed = totalDistance / timeTaken;

      // Print result
      System.out.println("Name: " + name);
      System.out.println("Travel Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
      System.out.println("Total Distance = " + totalDistance + " miles");
      System.out.println("Time Taken = " + timeTaken + " hours");
      System.out.println("Average Speed = " + averageSpeed + " miles/hour");

      // Close Scanner
      input.close();
   }
}
