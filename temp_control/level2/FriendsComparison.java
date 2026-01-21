// Creating Class with name FriendsComparison indicating the purpose is to 
// find the youngest and tallest among Amar, Akbar, and Anthony
import java.util.Scanner;

class FriendsComparison {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input for Amar
      int amarAge = input.nextInt();
      double amarHeight = input.nextDouble();

      // Get input for Akbar
      int akbarAge = input.nextInt();
      double akbarHeight = input.nextDouble();

      // Get input for Anthony
      int anthonyAge = input.nextInt();
      double anthonyHeight = input.nextDouble();

      // Find youngest friend based on age
      String youngestFriend;
      int youngestAge;

      if (amarAge <= akbarAge && amarAge <= anthonyAge) {
         youngestFriend = "Amar";
         youngestAge = amarAge;
      } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
         youngestFriend = "Akbar";
         youngestAge = akbarAge;
      } else {
         youngestFriend = "Anthony";
         youngestAge = anthonyAge;
      }

      // Find tallest friend based on height
      String tallestFriend;
      double tallestHeight;

      if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
         tallestFriend = "Amar";
         tallestHeight = amarHeight;
      } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
         tallestFriend = "Akbar";
         tallestHeight = akbarHeight;
      } else {
         tallestFriend = "Anthony";
         tallestHeight = anthonyHeight;
      }

      // Print results
      System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
      System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);

      // Closing the Scanner Stream
      input.close();
   }
}
