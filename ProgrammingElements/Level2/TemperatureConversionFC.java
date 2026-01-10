// Creating Class with name TemperatureConversion indicating the purpose is to 
// convert temperature from Fahrenheit to Celsius
import java.util.Scanner;

class TemperatureConversionFC {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value in Fahrenheit
      double fahrenheit = input.nextDouble();

      // Convert Fahrenheit to Celsius using formula
      double celsiusResult = (fahrenheit - 32) * 5.0 / 9.0;

      // Print the result
      System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

      // Closing the Scanner Stream
      input.close();
   }
}
