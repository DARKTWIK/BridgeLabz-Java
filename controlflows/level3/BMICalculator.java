// Creating Class with name BMICalculator indicating the purpose is to 
// calculate the BMI of a person and determine the weight status
import java.util.Scanner;

class BMICalculator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double weight = input.nextDouble();   // in kg
      double heightCm = input.nextDouble(); // in cm

      // Convert height from cm to meters
      double heightMeter = heightCm / 100;

      // Calculate BMI using formula
      double bmi = weight / (heightMeter * heightMeter);

      // Display BMI value
      System.out.println("BMI value is " + bmi);

      // Determine weight status
      if (bmi <= 18.4) {
         System.out.println("Weight Status: Underweight");
      } else if (bmi >= 18.5 && bmi <= 24.9) {
         System.out.println("Weight Status: Normal");
      } else if (bmi >= 25.0 && bmi <= 39.9) {
         System.out.println("Weight Status: Overweight");
      } else {
         System.out.println("Weight Status: Obese");
      }

      // Closing the Scanner Stream
      input.close();
   }
}
