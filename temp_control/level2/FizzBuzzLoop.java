// Creating Class with name FizzBuzz indicating the purpose is to 
// print numbers from 1 to n with Fizz, Buzz, and FizzBuzz rules using a while loop
import java.util.Scanner;

class FizzBuzzLoop {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         int counter = 1;

         // Loop from 1 to the number using while loop
         while (counter <= number) {

            if (counter % 3 == 0 && counter % 5 == 0) {
               System.out.println("FizzBuzz");
            } else if (counter % 3 == 0) {
               System.out.println("Fizz");
            } else if (counter % 5 == 0) {
               System.out.println("Buzz");
            } else {
               System.out.println(counter);
            }

            counter++;
         }

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
