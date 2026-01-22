package level3;

import java.util.Scanner;

/*
 * Program Name : CollinearPointsChecker
 * Description  : Checks whether three points are collinear using
 *                slope method and area of triangle method
 */
public class CollinearPointsChecker {

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

        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();

        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        /* ---------------- Collinearity Checks ---------------- */

        boolean slopeResult = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        /* ---------------- Display Results ---------------- */

        System.out.println("\nUsing Slope Formula Method : " +
                (slopeResult ? "Collinear" : "Not Collinear"));

        System.out.println("Using Area Formula Method  : " +
                (areaResult ? "Collinear" : "Not Collinear"));

        scanner.close();
    }

    /*
     * Method Name  : areCollinearUsingSlope
     * Description  : Checks collinearity using slope comparison
     */
    public static boolean areCollinearUsingSlope(double x1, double y1,
                                                 double x2, double y2,
                                                 double x3, double y3) {

        // Handle vertical line case
        if ((x2 - x1 == 0) && (x3 - x2 == 0)) {
            return true;
        }

        if ((x2 - x1 == 0) || (x3 - x2 == 0) || (x3 - x1 == 0)) {
            return false;
        }

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    /*
     * Method Name  : areCollinearUsingArea
     * Description  : Checks collinearity using triangle area formula
     */
    public static boolean areCollinearUsingArea(double x1, double y1,
                                                double x2, double y2,
                                                double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3)
                + x2 * (y3 - y1)
                + x3 * (y1 - y2));

        return area == 0;
    }
}
