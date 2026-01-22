package level2;

import java.util.Scanner;

/*
 * Program Name : FactorStatisticsCalculator
 * Description  : Finds factors of a number and calculates their sum,
 *                sum of squares, and product
 */
class FactorStatisticsCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter a positive integer number: ");

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();

                if (number > 0) {
                    isValidInput = true;
                } else {
                    System.err.println("Error: Please enter a positive number.");
                }

            } else {
                System.err.println("Error: Invalid input.");
                scanner.next();
            }
        }

        /* ---------------- Find Factors ---------------- */

        int[] factors = findFactors(number);

        /* ---------------- Calculations ---------------- */

        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double sumOfSquares = findSumOfSquaresOfFactors(factors);

        /* ---------------- Display Results ---------------- */

        System.out.println("\nFactors of " + number + ":");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\n\nSum of factors           : " + sum);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        System.out.println("Product of factors       : " + product);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findFactors
     * Description  : Finds all factors of a number and returns them as an array
     * Parameter    : number
     * Return Type  : int[]
     */
    public static int[] findFactors(int number) {

        /* ----- First loop: count factors ----- */

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        /* ----- Initialize array ----- */

        int[] factors = new int[count];

        /* ----- Second loop: store factors ----- */

        int index = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    /*
     * Method Name  : findSumOfFactors
     */
    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    /*
     * Method Name  : findProductOfFactors
     */
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    /*
     * Method Name  : findSumOfSquaresOfFactors
     */
    public static double findSumOfSquaresOfFactors(int[] factors) {

        double sumOfSquares = 0;

        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }

        return sumOfSquares;
    }
}

