package level2;

import java.util.Scanner;

/*
 * Program Name : NumberAnalyzerWithMethods
 * Description  : Analyzes 5 numbers for positivity/negativity, even/odd,
 *                and compares first and last elements
 */
public class NumberAnalyzerWithMethods {

    /*
     * Method Name  : isPositive
     * Description  : Checks if a number is positive
     * Return       : true if positive, false otherwise
     */
    public static boolean isPositive(int number) {
        return number > 0;
    }

    /*
     * Method Name  : isEven
     * Description  : Checks if a number is even
     * Return       : true if even, false if odd
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /*
     * Method Name  : compare
     * Description  : Compares two numbers
     * Return       : 1 if number1 > number2
     *                0 if equal
     *               -1 if number1 < number2
     */
    public static int compare(int number1, int number2) {

        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

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

                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                    isValidInput = true;
                } else {
                    System.err.println("Invalid input. Please enter a valid integer.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        /* ---------------- Analyze Each Number ---------------- */

        System.out.println("\n----- Number Analysis -----");

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

            // Check positive or negative
            if (isPositive(currentNumber)) {

                // Check even or odd
                if (isEven(currentNumber)) {
                    System.out.println(currentNumber + " is Positive and Even.");
                } else {
                    System.out.println(currentNumber + " is Positive and Odd.");
                }

            } else if (currentNumber < 0) {

                System.out.println(currentNumber + " is Negative.");

            } else {

                System.out.println(currentNumber + " is Zero.");
            }
        }

        /* ---------------- Compare First and Last Elements ---------------- */

        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];

        int comparisonResult = compare(firstElement, lastElement);

        System.out.println("\n----- First and Last Element Comparison -----");

        if (comparisonResult == 1) {
            System.out.println("First element (" + firstElement + ") is greater than last element (" + lastElement + ").");
        }
        else if (comparisonResult == -1) {
            System.out.println("First element (" + firstElement + ") is less than last element (" + lastElement + ").");
        }
        else {
            System.out.println("First element (" + firstElement + ") is equal to last element (" + lastElement + ").");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}

