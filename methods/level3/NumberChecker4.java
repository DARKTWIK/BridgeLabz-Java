package level3;

/*
 * Utility Class Name : NumberChecker
 * Description        : Provides number property checking utilities
 */
public class NumberChecker4 {

    /* ---------------- Prime Number Check ---------------- */

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /* ---------------- Neon Number Check ---------------- */

    public static boolean isNeonNumber(int number) {

        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number;
    }

    /* ---------------- Spy Number Check ---------------- */

    public static boolean isSpyNumber(int number) {

        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp > 0) {

            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    /* ---------------- Automorphic Number Check ---------------- */

    public static boolean isAutomorphicNumber(int number) {

        long square = (long) number * number;
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);

        return squareStr.endsWith(numberStr);
    }

    /* ---------------- Buzz Number Check ---------------- */

    public static boolean isBuzzNumber(int number) {

        return (number % 7 == 0) || (number % 10 == 7);
    }
}
