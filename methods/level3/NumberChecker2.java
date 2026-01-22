package level3;

/*
 * Utility Class Name : NumberChecker
 * Description        : Provides digit-based operations on numbers
 */
public class NumberChecker2 {

    /* ---------------- Count Digits ---------------- */

    public static int countDigits(int number) {

        if (number == 0) {
            return 1;
        }

        int count = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    /* ---------------- Store Digits in Array ---------------- */

    public static int[] storeDigits(int number) {

        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        int temp = Math.abs(number);

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        return digits;
    }

    /* ---------------- Sum of Digits ---------------- */

    public static int findSumOfDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    /* ---------------- Sum of Squares of Digits ---------------- */

    public static double findSumOfSquaresOfDigits(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    /* ---------------- Harshad Number Check ---------------- */

    public static boolean isHarshadNumber(int number, int[] digits) {

        if (number == 0) {
            return false;
        }

        int sumOfDigits = findSumOfDigits(digits);

        return number % sumOfDigits == 0;
    }

    /* ---------------- Digit Frequency (2D Array) ---------------- */

    public static int[][] findDigitFrequency(int[] digits) {

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;   // digit
            frequency[i][1] = 0;   // count
        }

        // Count occurrences
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
}

