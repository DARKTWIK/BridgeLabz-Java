// Creating Class with name DistanceConverter indicating the purpose is to 
// convert distance from kilometers to miles
class DistanceConverter {
   public static void main(String[] args) {

      // Given distance in kilometers
      double kilometers = 10.8;

      // Correct conversion factor
      double milesPerKilometer = 0.621371;

      // Convert to miles
      double miles = kilometers * milesPerKilometer;

      // Print the result
      System.out.println("The distance " + kilometers + " km in miles is " + miles);
   }
}
