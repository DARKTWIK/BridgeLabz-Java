import java.util.Scanner;

/*
 * Program Name : MultiplicationTable
 * Description  : Generates and displays the multiplication table of a number using an array
 */
class MultiplicationTable {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        int tableSize = 10;
        int[] multiplicationResults = new int[tableSize];

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter an integer number to generate multiplication table: ");

            // Validate integer input
            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                isValidInput = true;

            } else {

                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Generate Multiplication Table ---------------- */

        for (int i = 0; i < multiplicationResults.length; i++) {

            int multiplier = i + 1;
            multiplicationResults[i] = number * multiplier;
        }

        /* ---------------- Display Multiplication Table ---------------- */

        System.out.println("\n----- Multiplication Table of " + number + " -----");

        for (int i = 0; i < multiplicationResults.length; i++) {

            int multiplier = i + 1;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResults[i]);
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
