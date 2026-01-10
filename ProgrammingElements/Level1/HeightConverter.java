// Creating Class with name HeightConverter indicating the purpose is to 
// convert height from centimeters to feet and inches
import java.util.Scanner;

class HeightConverter {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input for height in cm
      double heightCm = input.nextDouble();

      // Convert cm to inches (1 inch = 2.54 cm)
      double totalInches = heightCm / 2.54;

      // Convert inches to feet and remaining inches
      int feet = (int) (totalInches / 12);
      double inches = totalInches % 12;

      // Print the result
      System.out.println("Your Height in cm is " + heightCm +
                         " while in feet is " + feet +
                         " and inches is " + inches);

      // Closing the Scanner Stream
      input.close();
   }
}
