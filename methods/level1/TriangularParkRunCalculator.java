package level1;

import java.util.Scanner;

/*
 * Program Name : TriangularParkRunCalculator
 * Description  : Calculates number of rounds required to complete a 5 km run
 *                in a triangular park
 */
class TriangularParkRunCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double sideA = 0.0;
        double sideB = 0.0;
        double sideC = 0.0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter side A (in meters): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid input for side A.");
                scanner.next();
                continue;
            }

            sideA = scanner.nextDouble();

            System.out.print("Enter side B (in meters): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid input for side B.");
                scanner.next();
                continue;
            }

            sideB = scanner.nextDouble();

            System.out.print("Enter side C (in meters): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid input for side C.");
                scanner.next();
                continue;
            }

            sideC = scanner.nextDouble();

            // Validate positive values
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                System.err.println("Error: All sides must be positive values.");
                continue;
            }

            // Triangle validity check
            if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
                System.err.println("Error: The entered sides do not form a valid triangle.");
                continue;
            }

            isValidInput = true;
        }

        /* ---------------- Calculate Number of Rounds ---------------- */

        double roundsRequired = calculateRoundsForFiveKm(sideA, sideB, sideC);

        /* ---------------- Display Result ---------------- */

        System.out.printf(
                "%nTo complete 5 km, the athlete must run %.2f rounds around the park.%n",
                roundsRequired
        );

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateRoundsForFiveKm
     * Description  : Calculates number of rounds required to cover 5 km
     * Parameters   : sideA, sideB, sideC (in meters)
     * Returns      : number of rounds
     */
    public static double calculateRoundsForFiveKm(double sideA, double sideB, double sideC) {

        double totalDistanceMeters = 5000.0;

        // Calculate perimeter of triangle
        double perimeter = sideA + sideB + sideC;

        // Calculate number of rounds
        double rounds = totalDistanceMeters / perimeter;

        return rounds;
    }
}
