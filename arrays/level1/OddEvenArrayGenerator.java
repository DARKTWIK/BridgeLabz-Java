import java.util.Scanner;

/*
 * Program Name : OddEvenArrayGenerator
 * Description  : Stores odd and even numbers between 1 and a user-entered
 *                natural number into separate arrays and displays them
 */
class OddEvenArrayGenerator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        System.out.print("Enter a natural number: ");

        // Validate integer input
        if (scanner.hasNextInt()) {

            number = scanner.nextInt();

            // Validate natural number (greater than 0)
            if (number <= 0) {
                System.err.println("Error: Please enter a valid natural number (greater than 0).");
                scanner.close();
                System.exit(0);
            }

        } else {

            System.err.println("Error: Invalid input. Please enter a valid integer.");
            scanner.close();
            System.exit(0);
        }

        /* ---------------- Array Initialization ---------------- */

        int arraySize = number / 2 + 1;

        int[] oddNumbers = new int[arraySize];
        int[] evenNumbers = new int[arraySize];

        int oddIndex = 0;
        int evenIndex = 0;

        /* ---------------- Store Odd and Even Numbers ---------------- */

        for (int i = 1; i <= number; i++) {

            // Check if number is even
            if (i % 2 == 0) {

                evenNumbers[evenIndex] = i;
                evenIndex++;

            }
            // Number is odd
            else {

                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        /* ---------------- Display Odd Numbers ---------------- */

        System.out.println("\nOdd Numbers:");

        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        /* ---------------- Display Even Numbers ---------------- */

        System.out.println("\n\nEven Numbers:");

        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
