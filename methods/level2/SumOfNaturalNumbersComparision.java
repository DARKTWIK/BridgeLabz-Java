package level2;

import java.util.Scanner;

/*
 * Program Name : SumOfNaturalNumbersComparison
 * Description  : Calculates sum of first N natural numbers using recursion
 *                and formula, then compares both results
 */
class SumOfNaturalNumbersComparison {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);
        int n = 0;

        /* ---------------- User Input & Validation ---------------- */

        System.out.print("Enter a natural number: ");

        if (!scanner.hasNextInt()) {
            System.err.println("Error: Invalid input. Please enter an integer.");
            scanner.close();
            System.exit(0);
        }

        n = scanner.nextInt();

        if (n <= 0) {
            System.err.println("Error: Please enter a valid natural number (greater than 0).");
            scanner.close();
            System.exit(0);
        }

        /* ---------------- Calculate Using Recursion ---------------- */

        long recursiveSum = findSumUsingRecursion(n);

        /* ---------------- Calculate Using Formula ---------------- */

        long formulaSum = findSumUsingFormula(n);

        /* ---------------- Display Results ---------------- */

        System.out.println("\nSum using Recursion = " + recursiveSum);
        System.out.println("Sum using Formula   = " + formulaSum);

        /* ---------------- Compare Results ---------------- */

        if (recursiveSum == formulaSum) {
            System.out.println("\nResult: Both computations are correct and equal.");
        } else {
            System.out.println("\nResult: The computations are NOT equal.");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findSumUsingRecursion
     * Description  : Finds sum of first n natural numbers using recursion
     */
    public static long findSumUsingRecursion(int n) {

        if (n == 1) {
            return 1;
        }

        return n + findSumUsingRecursion(n - 1);
    }

    /*
     * Method Name  : findSumUsingFormula
     * Description  : Finds sum using formula n*(n+1)/2
     */
    public static long findSumUsingFormula(int n) {

        return (long) n * (n + 1) / 2;
    }
}

