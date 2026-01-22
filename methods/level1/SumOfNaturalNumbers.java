package level1;

import java.util.Scanner;

/*
 * Program Name : SumOfNaturalNumbers
 * Description  : Calculates the sum of first N natural numbers using a loop
 */
class SumOfNaturalNumbers {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter a natural number: ");

            if (scanner.hasNextInt()) {

                n = scanner.nextInt();

                if (n > 0) {
                    isValidInput = true;
                } else {
                    System.err.println("Error: Please enter a natural number greater than 0.");
                }

            } else {
                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Calculate Sum ---------------- */

        long sum = calculateSumOfNaturalNumbers(n);

        /* ---------------- Display Result ---------------- */

        System.out.println("\nSum of first " + n + " natural numbers = " + sum);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateSumOfNaturalNumbers
     * Description  : Calculates sum using loop
     * Parameter    : n (int)
     * Return Type  : long
     */
    public static long calculateSumOfNaturalNumbers(int n) {

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
