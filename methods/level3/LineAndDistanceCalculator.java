package level3;

import java.util.Scanner;

/*
 * Program Name : LineAndDistanceCalculator
 * Description  : Calculates Euclidean distance and equation of a line
 *                between two given points
 */
public class LineAndDistanceCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* ---------------- User Input ---------------- */

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        /* ---------------- Euclidean Distance ---------------- */

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.printf("\nEuclidean Distance = %.4f\n", distance);

        /* ---------------- Line Equation ---------------- */

        double[] lineParameters = findLineEquation(x1, y1, x2, y2);

        if (lineParameters.length == 0) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical line)");
        } else {
            double slope = lineParameters[0];
            double intercept = lineParameters[1];

            System.out.printf("Equation of line: y = %.4fx + %.4f\n", slope, intercept);
        }

        scanner.close();
    }

    /*
     * Method Name  : calculateDistance
     * Description  : Calculates Euclidean distance between two points
     * Return Type  : double
     */
    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2) {

        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    /*
     * Method Name  : findLineEquation
     * Description  : Calculates slope and y-intercept of the line
     * Return Type  : double[]  → { slope, intercept }
     */
    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        // Vertical line case
        if (x2 == x1) {
            return new double[0];
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        return new double[] { slope, intercept };
    }
}

