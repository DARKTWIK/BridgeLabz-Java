import java.util.Scanner;

/*
 * Program Name : NumberStorageAndSum
 * Description  : Stores up to 10 positive numbers entered by the user,
 *                stops on zero or negative input, and calculates their sum
 */
class NumberStorageAndSum {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        int maxSize = 10;
        double[] numbers = new double[maxSize];

        double totalSum = 0.0;
        int index = 0;

        /* ---------------- User Input Using Infinite Loop ---------------- */

        while (true) {

            // Check if array is full
            if (index >= numbers.length) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            System.out.print("Enter a positive number (0 or negative to stop): ");

            // Validate numeric input
            if (!scanner.hasNextDouble()) {
                System.err.println("Error: Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
                continue;
            }

            double userInput = scanner.nextDouble();

            // Check for stop condition
            if (userInput <= 0) {
                System.out.println("Input stopped by user.");
                break;
            }

            // Store valid number in array
            numbers[index] = userInput;
            index++;
        }

        /* ---------------- Calculate Total Using For Loop ---------------- */

        for (int i = 0; i < index; i++) {
            totalSum += numbers[i];
        }

        /* ---------------- Display Stored Numbers ---------------- */

        System.out.println("\nStored Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }

        /* ---------------- Display Total Sum ---------------- */

        System.out.println("\nTotal Sum = " + totalSum);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
