// Creating Class with name RocketLaunchCountdown indicating the purpose is to 
// perform a countdown for a rocket launch using a for loop
import java.util.Scanner;

class RocketLaunchCountdown8 {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for countdown
      int counter = input.nextInt();

      // Perform countdown using for loop
      for (int i = counter; i >= 1; i--) {
         System.out.println(i);
      }

      // Closing the Scanner Stream
      input.close();
   }
}
