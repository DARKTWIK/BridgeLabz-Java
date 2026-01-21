// Creating Class with name SimpleInterestCalculator indicating the purpose is to 
// calculate simple interest using principal, rate, and time
import java.util.Scanner;

class SimpleInterestCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input values
      double principal = input.nextDouble();
      double rate = input.nextDouble();
      double time = input.nextDouble();

      // Calculate simple interest
      double simpleInterest = (principal * rate * time) / 100;

      // Print the result
      System.out.println("The Simple Interest is " + simpleInterest +
                         " for Principal " + principal +
                         ", Rate of Interest " + rate +
                         " and Time " + time);

      // Closing the Scanner Stream
      input.close();
   }
}
