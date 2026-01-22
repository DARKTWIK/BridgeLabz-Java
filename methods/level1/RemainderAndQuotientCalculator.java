package level1;

import java.util.Scanner;

/*
 * Program Name : RemainderAndQuotientCalculator
 * Description  : Finds quotient and remainder of two integers
 */
class RemainderAndQuotientCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int divisor = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter the number: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }
            number = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }
            divisor = scanner.nextInt();

            if (divisor == 0) {
                System.err.println("Error: Divisor cannot be zero.");
                continue;
            }

            isValidInput = true;
        }

        /* ---------------- Find Remainder and Quotient ---------------- */

        int[] result = findRemainderAndQuotient(number, divisor);

        /* ---------------- Display Result ---------------- */

        System.out.println("\nQuotient  = " + result[0]);
        System.out.println("Remainder = " + result[1]);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findRemainderAndQuotient
     * Description  : Calculates quotient and remainder
     * Parameters   : number, divisor
     * Return Type  : int[] (index 0 = quotient, index 1 = remainder)
     */
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { quotient, remainder };
    }
}
