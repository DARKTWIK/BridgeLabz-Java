import java.util.Scanner;

/*
 * Program Name : MeanHeightCalculator
 * Description  : Calculates the mean height of 11 football players
 */
class MeanHeightCalculator {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int totalPlayers = 11;
        double[] heights = new double[totalPlayers];

        double sumOfHeights = 0.0;
        double meanHeight = 0.0;

        /* ---------------- Input Heights with Validation ---------------- */

        for (int i = 0; i < heights.length; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.print("Enter height of player " + (i + 1) + ": ");

                // Validate numeric input
                if (scanner.hasNextDouble()) {

                    double heightInput = scanner.nextDouble();

                    // Validate non-negative height
                    if (heightInput > 0) {
                        heights[i] = heightInput;
                        isValidInput = true;
                    } else {
                        System.err.println("Error: Height must be a positive value.");
                    }

                } else {

                    System.err.println("Error: Invalid input. Please enter a valid numeric value.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        /* ---------------- Calculate Sum of Heights ---------------- */

        for (int i = 0; i < heights.length; i++) {
            sumOfHeights += heights[i];
        }

        /* ---------------- Calculate Mean Height ---------------- */

        meanHeight = sumOfHeights / heights.length;

        /* ---------------- Display Result ---------------- */

        System.out.println("\nTotal Players : " + heights.length);
        System.out.println("Sum of Heights: " + sumOfHeights);
        System.out.println("Mean Height   : " + meanHeight);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
