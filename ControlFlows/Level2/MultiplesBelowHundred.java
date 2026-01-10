// Creating Class with name MultiplesBelowHundred indicating the purpose is to 
// find and print all multiples of a given number below 100
import java.util.Scanner;

class MultiplesBelowHundred {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Check if the number is a positive integer and less than 100
      if (number > 0 && number < 100) {

         System.out.println("Multiples of " + number + " below 100 are:");

         // Run loop backward from 100 to 1
         for (int i = 100; i >= 1; i--) {

            // Check if i is a multiple of the given number
            if (i % number == 0) {
               System.out.println(i);
            }
         }

      } else {

         // Print message if input is invalid
         System.out.println("The number " + number + " is not a valid positive integer less than 100");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
