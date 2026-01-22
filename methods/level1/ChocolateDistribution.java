package level1;

import java.util.Scanner;

/*
 * Program Name : ChocolateDistribution
 * Description  : Divides chocolates among children and displays
 *                chocolates per child and remaining chocolates
 */
class ChocolateDistribution {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int numberOfChocolates = 0;
        int numberOfChildren = 0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter number of chocolates: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                scanner.next();
                continue;
            }
            numberOfChocolates = scanner.nextInt();

            System.out.print("Enter number of children: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                scanner.next();
                continue;
            }
            numberOfChildren = scanner.nextInt();

            if (numberOfChocolates < 0 || numberOfChildren <= 0) {
                System.err.println("Error: Chocolates must be >= 0 and children must be > 0.");
                continue;
            }

            isValidInput = true;
        }

        /* ---------------- Calculate Distribution ---------------- */

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        int chocolatesPerChild = result[0];
        int remainingChocolates = result[1];

        /* ---------------- Display Result ---------------- */

        System.out.println("\nEach child will get: " + chocolatesPerChild + " chocolates");
        System.out.println("Remaining chocolates: " + remainingChocolates);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findRemainderAndQuotient
     * Description  : Calculates quotient and remainder
     * Parameters   : number (chocolates), divisor (children)
     * Return Type  : int[] (index 0 = quotient, index 1 = remainder)
     */
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[] { quotient, remainder };
    }
}

