package level1;
import java.util.Scanner;

/*
 * Program Name : MaximumHandshakesCalculator
 * Description  : Calculates the maximum number of possible handshakes
 *                among N students using the combination formula
 */
class MaximumHandshakesCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = 0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter number of students: ");

            if (scanner.hasNextInt()) {

                numberOfStudents = scanner.nextInt();

                if (numberOfStudents > 1) {
                    isValidInput = true;
                } else {
                    System.err.println("Error: Number of students must be greater than 1.");
                }

            } else {

                System.err.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        /* ---------------- Handshake Calculation ---------------- */

        long maximumHandshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;

        /* ---------------- Display Result ---------------- */

        System.out.println("\nMaximum number of possible handshakes = " + maximumHandshakes);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
