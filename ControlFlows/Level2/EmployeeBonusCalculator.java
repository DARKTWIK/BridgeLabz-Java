// Creating Class with name EmployeeBonusCalculator indicating the purpose is to 
// calculate the bonus of an employee based on years of service
import java.util.Scanner;

class EmployeeBonusCalculator {
   public static void main(String[] args) {

      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get input values
      double salary = input.nextDouble();
      int yearsOfService = input.nextInt();

      // Initialize bonus
      double bonus = 0.0;

      // Check if employee is eligible for bonus
      if (yearsOfService > 5) {
         bonus = salary * 0.05;
      }

      // Print the bonus amount
      System.out.println("The bonus amount is " + bonus);

      // Closing the Scanner Stream
      input.close();
   }
}
