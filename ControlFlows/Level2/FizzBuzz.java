// Creating Class with name FizzBuzz indicating the purpose is to 
// print numbers from 1 to n with Fizz, Buzz, and FizzBuzz rules
import java.util.Scanner;

class FizzBuzz {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer
      if (number > 0) {

         // Loop from 1 to the number using for loop
         for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
               System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
               System.out.println("Fizz");
            } else if (i % 5 == 0) {
               System.out.println("Buzz");
            } else {
               System.out.println(i);
            }
         }

      } else {

         // Print message if not a positive integer
         System.out.println("The number " + number + " is not a positive integer");

      }

      // Closing the Scanner Stream
      input.close();
   }
}

