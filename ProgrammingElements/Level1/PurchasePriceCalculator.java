// Creating Class with name PurchasePriceCalculator indicating the purpose is to 
// calculate total purchase price based on unit price and quantity
import java.util.Scanner;

class PurchasePriceCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input values
      double unitPrice = input.nextDouble();
      int quantity = input.nextInt();

      // Calculate total price
      double totalPrice = unitPrice * quantity;

      // Print the result
      System.out.println("The total purchase price is INR " + totalPrice +
                         " if the quantity " + quantity +
                         " and unit price is INR " + unitPrice);

      // Closing the Scanner Stream
      input.close();
   }
}
