// Creating Class with name PrimeNumberChecker indicating the purpose is to 
// check whether a given number is a prime number or not
import java.util.Scanner;

class PrimeNumberChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Prime numbers are greater than 1
      if (number > 1) {

         boolean isPrime = true;

         // Check divisibility from 2 to number - 1
         for (int i = 2; i < number; i++) {

            if (number % i == 0) {
               isPrime = false;
               break;
            }
         }

         // Print result
         if (isPrime) {
            System.out.println("The number " + number + " is a Prime Number");
         } else {
            System.out.println("The number " + number + " is not a Prime Number");
         }

      } else {

         // Not prime for numbers <= 1
         System.out.println("The number " + number + " is not a Prime Number");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
