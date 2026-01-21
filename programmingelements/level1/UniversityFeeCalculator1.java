// Creating Class with name UniversityFeeCalculator indicating the purpose is to 
// calculate discount and final fee to be paid based on user input
import java.util.Scanner;

class UniversityFeeCalculator1 {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double fee = input.nextDouble();
      double discountPercent = input.nextDouble();

      // Calculate discount amount
      double discount = (fee * discountPercent) / 100;

      // Calculate final fee after discount
      double finalFee = fee - discount;

      // Print the result
      System.out.println("The discount amount is INR " + discount +
                         " and final discounted fee is INR " + finalFee);

      // Closing the Scanner Stream
      input.close();
   }
}
