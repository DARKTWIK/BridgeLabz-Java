package level1;
import java.util.Scanner;

/*
 * Program Name : HandshakeCalculator
 * Description  : Calculates the maximum number of handshakes among N students
 */
class HandshakeCalculator {

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
                scanner.next();
            }
        }

        /* ---------------- Calculate Handshakes ---------------- */

        long maxHandshakes = calculateHandshakes(numberOfStudents);

        /* ---------------- Display Result ---------------- */

        System.out.println("\nMaximum number of handshakes among " +
                numberOfStudents + " students is: " + maxHandshakes);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateHandshakes
     * Description  : Calculates maximum number of handshakes using
     *                combination formula (n * (n - 1)) / 2
     * Parameters   : numberOfStudents
     * Returns      : maximum handshakes
     */
    public static long calculateHandshakes(int numberOfStudents) {

        long handshakes = (long) numberOfStudents * (numberOfStudents - 1) / 2;
        return handshakes;
    }
}

