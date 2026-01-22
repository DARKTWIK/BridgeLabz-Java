package level2;

import java.util.Scanner;

/*
 * Program Name : Quadratic
 * Description  : Finds the roots of a quadratic equation ax^2 + bx + c = 0
 */
public class Quadratic {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter value of a: ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid input for a.");
                scanner.next();
                continue;
            }
            a = scanner.nextDouble();

            if (a == 0) {
                System.err.println("Value of 'a' cannot be zero for a quadratic equation.");
                continue;
            }

            System.out.print("Enter value of b: ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid input for b.");
                scanner.next();
                continue;
            }
            b = scanner.nextDouble();

            System.out.print("Enter value of c: ");
            if (!scanner.hasNextDouble()) {
                System.err.println("Invalid input for c.");
                scanner.next();
                continue;
            }
            c = scanner.nextDouble();

            isValidInput = true;
        }

        /* ---------------- Find Roots ---------------- */

        double[] roots = findRoots(a, b, c);

        /* ---------------- Display Result ---------------- */

        if (roots.length == 2) {

            System.out.println("\nTwo real roots found:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);

        } else if (roots.length == 1) {

            System.out.println("\nOne real root found:");
            System.out.println("Root = " + roots[0]);

        } else {

            System.out.println("\nNo real roots exist (delta is negative).");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findRoots
     * Description  : Finds the roots of ax^2 + bx + c = 0
     * Return Type  : double[]
     */
    public static double[] findRoots(double a, double b, double c) {

        // Calculate discriminant (delta)
        double delta = Math.pow(b, 2) - (4 * a * c);

        // Case 1: Two real roots
        if (delta > 0) {

            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);

            return new double[] { root1, root2 };
        }

        // Case 2: One real root
        if (delta == 0) {

            double root = -b / (2 * a);
            return new double[] { root };
        }

        // Case 3: No real roots
        return new double[0];
    }
}
