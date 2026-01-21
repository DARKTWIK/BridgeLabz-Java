import java.util.Scanner;

/*
 * Program Name : LargestAndSecondLargestDigitFinderDynamic
 * Description  : Stores all digits of a user-entered number in a dynamically
 *                expanding array and finds the largest and second largest digits
 */
class LargestAndSecondLargestFinderDynamic {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter a positive integer number: ");

            if (scanner.hasNextInt()) {

                number = scanner.nextInt();

                if (number > 0) {
                    isValidInput = true;
                } else {
                    System.err.println("Error: Please enter a positive integer greater than zero.");
                }

            } else {

                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Extract Digits and Store in Dynamic Array ---------------- */

        int tempNumber = number;

        while (tempNumber != 0) {

            // Expand array size if full
            if (index == maxDigit) {

                maxDigit = maxDigit + 10;

                int[] tempArray = new int[maxDigit];

                // Copy existing digits to new array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }

                // Assign expanded array
                digits = tempArray;
            }

            // Extract last digit
            int digit = tempNumber % 10;

            // Store digit
            digits[index] = digit;
            index++;

            // Remove last digit
            tempNumber /= 10;
        }

        /* ---------------- Initialize Largest and Second Largest ---------------- */

        int largestDigit = 0;
        int secondLargestDigit = 0;

        /* ---------------- Find Largest and Second Largest Digits ---------------- */

        for (int i = 0; i < index; i++) {

            int currentDigit = digits[i];

            if (currentDigit > largestDigit) {

                secondLargestDigit = largestDigit;
                largestDigit = currentDigit;

            } else if (currentDigit > secondLargestDigit && currentDigit < largestDigit) {

                secondLargestDigit = currentDigit;
            }
        }

        /* ---------------- Display Stored Digits ---------------- */

        System.out.println("\nDigits stored in array:");

        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        /* ---------------- Display Results ---------------- */

        System.out.println("\n\nLargest Digit       : " + largestDigit);
        System.out.println("Second Largest Digit: " + secondLargestDigit);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}

