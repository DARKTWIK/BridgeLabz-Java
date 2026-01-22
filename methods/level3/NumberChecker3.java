package level3;

/*
 * Utility Class Name : NumberChecker
 * Description        : Provides digit-based utility operations
 */
public class NumberChecker3 {

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

    /* ---------------- Reverse Digits Array ---------------- */

    public static int[] reverseDigitsArray(int[] digits) {

        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    /* ---------------- Compare Two Arrays ---------------- */

    public static boolean compareArrays(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    /* ---------------- Palindrome Check ---------------- */

    public static boolean isPalindrome(int[] digits) {

        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    /* ---------------- Duck Number Check ---------------- */
    /* (As per hint: number contains at least one NON-ZERO digit) */

    public static boolean isDuckNumber(int[] digits) {

        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }

        return false;
    }
}
