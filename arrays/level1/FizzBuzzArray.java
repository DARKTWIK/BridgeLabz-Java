import java.util.Scanner;

/*
 * Program Name : FizzBuzzArray
 * Description  : Implements FizzBuzz logic using an array and displays
 *                results with index positions
 */
class FizzBuzzArray {

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
                    System.err.println("Error: Please enter a positive integer.");
                }

            } else {

                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Create String Array ---------------- */

        String[] fizzBuzzResults = new String[number + 1];

        /* ---------------- Generate FizzBuzz Results ---------------- */

        for (int i = 0; i <= number; i++) {

            // Handle position 0 separately
            if (i == 0) {
                fizzBuzzResults[i] = "0";
            }
            // Check for multiples of both 3 and 5
            else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            }
            // Check for multiples of 3
            else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            }
            // Check for multiples of 5
            else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            }
            // Store the number as string
            else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }

        /* ---------------- Display Results ---------------- */

        System.out.println("\n----- FizzBuzz Results -----");

        for (int i = 0; i < fizzBuzzResults.length; i++) {

            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
