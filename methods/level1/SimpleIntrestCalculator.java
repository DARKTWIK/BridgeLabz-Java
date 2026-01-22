package level1;
import java.util.Scanner;

/*
 * Program Name : SimpleInterestCalculator
 * Description  : Calculates Simple Interest using Principal, Rate and Time
 */
class SimpleIntrestCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        double principal = 0.0;
        double rate = 0.0;
        double time = 0.0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter Principal amount: ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid principal value.");
                scanner.next();
                continue;
            }

            principal = scanner.nextDouble();

            System.out.print("Enter Rate of Interest: ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid rate value.");
                scanner.next();
                continue;
            }

            rate = scanner.nextDouble();

            System.out.print("Enter Time (in years): ");

            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid time value.");
                scanner.next();
                continue;
            }

            time = scanner.nextDouble();

            if (principal <= 0 || rate <= 0 || time <= 0) {
                System.err.println("Error: Principal, Rate, and Time must be positive values.");
                continue;
            }

            isValidInput = true;
        }

        /* ---------------- Calculate Simple Interest ---------------- */

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        /* ---------------- Display Result ---------------- */

        System.out.println("\nThe Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {

        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }
}
