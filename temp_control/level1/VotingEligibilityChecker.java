// Creating Class with name VotingEligibilityChecker indicating the purpose is to 
// check whether a person can vote based on age
import java.util.Scanner;

class VotingEligibilityChecker {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input value for age
      int age = input.nextInt();

      // Check voting eligibility
      if (age >= 18) {

         // Print message if the person can vote
         System.out.println("The person's age is " + age + " and can vote.");

      } else {

         // Print message if the person cannot vote
         System.out.println("The person's age is " + age + " and cannot vote.");

      }

      // Closing the Scanner Stream
      input.close();
   }
}
