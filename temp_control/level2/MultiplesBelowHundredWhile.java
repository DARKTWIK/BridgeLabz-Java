// Creating Class with name MultiplesBelowHundred indicating the purpose is to 
// find and print all multiples of a given number below 100 using a while loop
import java.util.Scanner;

class MultiplesBelowHundredWhile {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer and less than 100
      if (number > 0 && number < 100) {

         System.out.println("Multiples of " + number + " below 100 are:");

         // Initialize counter
         int counter = 100;

         // Loop using while
         while (counter > 1) {

            // Check if counter is a multiple of the given number
            if (counter % number == 0) {
               System.out.println(counter);
            }

            counter--;
         }

      } else {

         // Print message if input is invalid
         System.out.println("The number " + number + " is not a valid positive integer less than 100");

      }

      // Closing the Scanner Stream
      input.close();
   }
}

