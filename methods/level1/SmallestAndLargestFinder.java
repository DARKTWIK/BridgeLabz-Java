package level1;
import java.util.Scanner;

/*
 * Program Name : SmallestAndLargestFinder
 * Description  : Finds the smallest and largest among three numbers
 */
class SmallestAndLargestFinder {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        int number3 = 0;

        boolean isValidInput = false;

        /* ---------------- User Input & Validation ---------------- */

        while (!isValidInput) {

            System.out.print("Enter first number: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                scanner.next();
                continue;
            }
            number1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                scanner.next();
                continue;
            }
            number2 = scanner.nextInt();

            System.out.print("Enter third number: ");
            if (!scanner.hasNextInt()) {
                System.err.println("Invalid input. Enter an integer.");
                scanner.next();
                continue;
            }
            number3 = scanner.nextInt();

            isValidInput = true;
        }

        /* ---------------- Find Smallest and Largest ---------------- */

        int[] result = findSmallestAndLargest(number1, number2, number3);

        /* ---------------- Display Result ---------------- */

        System.out.println("\nSmallest number = " + result[0]);
        System.out.println("Largest number  = " + result[1]);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : findSmallestAndLargest
     * Description  : Finds smallest and largest among three numbers
     * Parameters   : number1, number2, number3
     * Return Type  : int[] (index 0 = smallest, index 1 = largest)
     */
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {

        int smallest = number1;
        int largest = number1;

        // Compare with second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Compare with third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[] { smallest, largest };
    }
}
