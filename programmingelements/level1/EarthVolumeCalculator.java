// Creating Class with name EarthVolumeCalculator indicating the purpose is to 
// compute the volume of Earth in cubic kilometers and cubic miles
class EarthVolumeCalculator {
   public static void main(String[] args) {

      // Given radius of Earth in kilometers
      double radiusKm = 6378;

      // Value of PI
      double pi = Math.PI;

      // Volume formula: (4/3) * pi * r^3
      double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

      // Conversion factor: 1 km = 0.621371 miles
      double kmToMiles = 0.621371;

      // Convert radius to miles
      double radiusMiles = radiusKm * kmToMiles;

      // Compute volume in cubic miles
      double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

      // Print the result
      System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMiles3
      );
   }
}
