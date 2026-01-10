// Creating Class with name TotalIncomeCalculator indicating the purpose is to 
// calculate total income from salary and bonus
import java.util.Scanner;

class TotalIncomeCalculator {
   public static void main(String[] args) {

      // Create Scanner Object
      Scanner input = new Scanner(System.in);

      // Get user input values
      double salary = input.nextDouble();
      double bonus = input.nextDouble();

      // Calculate total income
      double totalIncome = salary + bonus;

      // Print the result
      System.out.println("The salary is INR " + salary +
                         " and bonus is INR " + bonus +
                         ". Hence Total Income is INR " + totalIncome);

      // Closing the Scanner Stream
      input.close();
   }
}
