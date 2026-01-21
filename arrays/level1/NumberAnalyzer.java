import java.util.Scanner;

/*
 * Program Name : NumberAnalyzer
 * Description  : Accepts 5 numbers from user, analyzes each number and
 *                compares the first and last elements of the array
 */
class NumberAnalyzer {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 5;
        int[] numbers = new int[totalNumbers];

        /* ---------------- Input Numbers with Validation ---------------- */

        for (int i = 0; i < numbers.length; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.print("Enter number " + (i + 1) + ": ");

                // Validate integer input
                if (scanner.hasNextInt()) {

                    numbers[i] = scanner.nextInt();
                    isValidInput = true;

                } else {

                    System.err.println("Error: Invalid input. Please enter a valid integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        /* ---------------- Analyze Each Number ---------------- */

        System.out.println("\n----- Number Analysis Result -----");

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

            // Check if the number is positive
            if (currentNumber > 0) {

                // Check even or odd for positive numbers
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is a positive even number.");
                } else {
                    System.out.println(currentNumber + " is a positive odd number.");
                }

            }
            // Check if the number is negative
            else if (currentNumber < 0) {

                System.out.println(currentNumber + " is a negative number.");

            }
            // Number is zero
            else {

                System.out.println(currentNumber + " is zero.");
            }
        }

        /* ---------------- Compare First and Last Elements ---------------- */

        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        System.out.println("\n----- First and Last Element Comparison -----");

        if (firstElement == lastElement) {

            System.out.println("First element (" + firstElement + ") is equal to last element (" + lastElement + ").");

        } else if (firstElement > lastElement) {

            System.out.println("First element (" + firstElement + ") is greater than last element (" + lastElement + ").");

        } else {

            System.out.println("First element (" + firstElement + ") is less than last element (" + lastElement + ").");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
