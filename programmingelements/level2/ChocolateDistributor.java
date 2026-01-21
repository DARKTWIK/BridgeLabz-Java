// Creating Class with name ChocolateDistributor indicating the purpose is to 
// distribute chocolates among children and find remaining chocolates
import java.util.Scanner;

class ChocolateDistributor {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      int numberOfChocolates = input.nextInt();
      int numberOfChildren = input.nextInt();

      // Check to avoid division by zero
      if (numberOfChildren > 0) {

         // Calculate chocolates per child
         int chocolatesPerChild = numberOfChocolates / numberOfChildren;

         // Calculate remaining chocolates
         int remainingChocolates = numberOfChocolates % numberOfChildren;

         // Print the result
         System.out.println("The number of chocolates each child gets is " 
                            + chocolatesPerChild +
                            " and the number of remaining chocolates are " 
                            + remainingChocolates);

      } else {

         System.out.println("Number of children must be greater than zero");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
