// Creating Class with name HandshakeCalculator indicating the purpose is to 
// calculate the maximum number of handshakes among N students
import java.util.Scanner;

class HandShakeCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int numberOfStudents = input.nextInt();

      // Check for valid input
      if (numberOfStudents > 1) {

         // Calculate number of handshakes using formula
         int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

         // Print the result
         System.out.println("The maximum number of possible handshakes is " + handshakes);

      } else {

         // For 0 or 1 student, no handshakes possible
         System.out.println("The maximum number of possible handshakes is 0");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
