// Creating Class with name MultiplicationTableGenerator indicating the purpose is to 
// generate the multiplication table of a given number from 6 to 9
import java.util.Scanner;

class MultiplicationTableGenerator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value
      int number = input.nextInt();

      // Generate multiplication table from 6 to 9 using for loop
      for (int i = 6; i <= 9; i++) {
         System.out.println(number + " * " + i + " = " + (number * i));
      }

      // Closing the Scanner Stream
      input.close();
   }
}
