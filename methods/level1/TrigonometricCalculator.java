package level1;

import java.util.Scanner;

/*
 * Program Name : TrigonometricCalculator
 * Description  : Calculates sine, cosine and tangent of an angle using Math class
 */
class TrigonometricCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double angleInDegrees = 0.0;
        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter angle in degrees: ");

            if (scanner.hasNextDouble()) {
                angleInDegrees = scanner.nextDouble();
                isValidInput = true;
            } else {
                System.err.println("Invalid input. Please enter a valid numeric value.");
                scanner.next();
            }
        }

        /* ---------------- Calculate Trigonometric Values ---------------- */

        double[] results = calculateTrigonometricFunctions(angleInDegrees);

        /* ---------------- Display Result ---------------- */

        System.out.printf("%nSine(%.2f°)   = %.6f%n", angleInDegrees, results[0]);
        System.out.printf("Cosine(%.2f°) = %.6f%n", angleInDegrees, results[1]);
        System.out.printf("Tangent(%.2f°)= %.6f%n", angleInDegrees, results[2]);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : calculateTrigonometricFunctions
     * Description  : Converts degrees to radians and calculates sin, cos, tan
     * Parameter    : angle in degrees
     * Return Type  : double[] (index 0 = sin, 1 = cos, 2 = tan)
     */
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sineValue = Math.sin(radians);
        double cosineValue = Math.cos(radians);
        double tangentValue = Math.tan(radians);

        return new double[] { sineValue, cosineValue, tangentValue };
    }
}

