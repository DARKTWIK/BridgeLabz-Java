package level1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            String firstInput = scanner.nextLine();

            System.out.print("Enter second date (yyyy-MM-dd): ");
            String secondInput = scanner.nextLine();

            LocalDate firstDate = LocalDate.parse(firstInput);
            LocalDate secondDate = LocalDate.parse(secondInput);

            System.out.println();

            if (firstDate.isBefore(secondDate)) {
                System.out.println("The first date is BEFORE the second date.");
            }
            else if (firstDate.isAfter(secondDate)) {
                System.out.println("The first date is AFTER the second date.");
            }
            else if (firstDate.isEqual(secondDate)) {
                System.out.println("Both dates are the SAME.");
            }

        } catch (Exception exception) {
            System.err.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}

