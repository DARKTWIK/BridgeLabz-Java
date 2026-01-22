package level3;

/*
 * Utility Class Name : NumberChecker
 * Description        : Provides factor-based and digit-based number utilities
 */
public class NumberChecker5 {

    /* ---------------- Find Factors ---------------- */

    public static int[] findFactors(int number) {

        // First loop: count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array
        int[] factors = new int[count];

        // Second loop: store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    /* ---------------- Greatest Factor ---------------- */

    public static int findGreatestFactor(int[] factors) {

        int greatest = factors[0];

        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }

        return greatest;
    }

    /* ---------------- Sum of Factors ---------------- */

    public static int findSumOfFactors(int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    /* ---------------- Product of Factors ---------------- */

    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    /* ---------------- Product of Cubes of Factors ---------------- */

    public static double findProductOfCubesOfFactors(int[] factors) {

        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }

        return product;
    }

    /* ---------------- Perfect Number ---------------- */

    public static boolean isPerfectNumber(int number, int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum == number;
    }

    /* ---------------- Abundant Number ---------------- */

    public static boolean isAbundantNumber(int number, int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum > number;
    }

    /* ---------------- Deficient Number ---------------- */

    public static boolean isDeficientNumber(int number, int[] factors) {

        int sum = 0;

        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }

        return sum < number;
    }

    /* ---------------- Strong Number ---------------- */

    public static boolean isStrongNumber(int number) {

        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    /* ---------------- Factorial Helper ---------------- */

    private static int factorial(int digit) {

        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }

        return fact;
    }
}

