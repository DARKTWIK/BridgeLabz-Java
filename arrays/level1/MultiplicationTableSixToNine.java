import java.util.Scanner;

/*
 * Program Name : MultiplicationTableSixToNine
 * Description  : Generates and displays the multiplication table of a user-entered
 *                number from multiplier 6 to 9 using an array
 */
class MultiplicationTableSixToNine {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        int startMultiplier = 6;
        int endMultiplier = 9;

        int resultSize = endMultiplier - startMultiplier + 1;
        int[] multiplicationResult = new int[resultSize];

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter an integer number: ");

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

        int arrayIndex = 0;

        for (int multiplier = startMultiplier; multiplier <= endMultiplier; multiplier++) {

            multiplicationResult[arrayIndex] = number * multiplier;
            arrayIndex++;
        }

        /* ---------------- Display Multiplication Table ---------------- */

        System.out.println("\n----- Multiplication Table of " + number + " (from 6 to 9) -----");

        for (int i = 0; i < multiplicationResult.length; i++) {

            int multiplier = startMultiplier + i;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
