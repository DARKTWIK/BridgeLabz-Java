// Creating Class with name RocketLaunchCountdown indicating the purpose is to 
// perform a countdown for a rocket launch using a while loop
import java.util.Scanner;

class RocketLaunchCountdown {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for countdown
      int counter = input.nextInt();

      // Perform countdown using while loop
      while (counter >= 1) {
         System.out.println(counter);
         counter--;
      }

      // Closing the Scanner Stream
      input.close();
   }
}
