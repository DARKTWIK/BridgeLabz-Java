package level1;

import java.util.Scanner;

/*
 * Program Name : NumberSignChecker
 * Description  : Checks whether a number is positive, negative, or zero
 */
class NumberSignChecker {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter an integer number: ");

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();
                isValidInput = true;

            } else {

                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Determine Number Sign ---------------- */

        int result = checkNumberSign(number);

        /* ---------------- Display Result ---------------- */

        if (result == 1) {
            System.out.println("The number is Positive.");
        }
        else if (result == -1) {
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("The number is Zero.");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : checkNumberSign
     * Description  : Returns 1 if number is positive, -1 if negative, 0 if zero
     * Parameter    : number (int)
     * Return Type  : int
     */
    public static int checkNumberSign(int number) {

        if (number > 0) {
            return 1;
        }
        else if (number < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
