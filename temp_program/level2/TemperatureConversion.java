// Creating Class with name TemperatureConversion indicating the purpose is to 
// convert temperature from Celsius to Fahrenheit
import java.util.Scanner;

class TemperatureConversion {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value in Celsius
      double celsius = input.nextDouble();

      // Convert Celsius to Fahrenheit using formula
      double fahrenheitResult = (celsius * 9.0 / 5.0) + 32;

      // Print the result
      System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

      // Closing the Scanner Stream
      input.close();
   }
}
