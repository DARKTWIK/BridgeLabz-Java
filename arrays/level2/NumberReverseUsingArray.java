import java.util.Scanner;

class NumberReverseUsingArray {

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
                    System.err.println("Error: Please enter a positive integer greater than zero.");
                }

            } else {
                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        /* ---------------- Find Count of Digits ---------------- */

        int digitCount = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            digitCount++;
            tempNumber /= 10;
        }

        /* ---------------- Store Digits in Correct Order ---------------- */

        int[] digits = new int[digitCount];
        tempNumber = number;

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = tempNumber % 10;
            tempNumber /= 10;
        }

        /* ---------------- Create Reversed Array ---------------- */

        int[] reversedDigits = new int[digitCount];

        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }

        /* ---------------- Display Reversed Number ---------------- */

        System.out.print("\nReversed Number: ");

        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }

        scanner.close();
    }
}
