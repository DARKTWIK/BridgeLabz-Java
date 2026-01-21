import java.util.Scanner;

/*
 * Program Name : FactorFinder
 * Description  : Finds all factors of a user-entered number,
 *                stores them in a dynamically resized array,
 *                and displays the factors
 */
class FactorFinder {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        boolean isValidInput = false;

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

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

        /* ---------------- Find Factors and Store in Array ---------------- */

        for (int i = 1; i <= number; i++) {

            // Check if i is a factor of number
            if (number % i == 0) {

                // Check if array capacity is reached
                if (index == maxFactor) {

                    // Double the array size
                    maxFactor = maxFactor * 2;

                    // Create temporary array with new size
                    int[] tempArray = new int[maxFactor];

                    // Copy old elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        tempArray[j] = factors[j];
                    }

                    // Assign new array to factors reference
                    factors = tempArray;
                }

                // Store factor in array
                factors[index] = i;
                index++;
            }
        }

        /* ---------------- Display Factors ---------------- */

        System.out.println("\nFactors of " + number + " are:");

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}

