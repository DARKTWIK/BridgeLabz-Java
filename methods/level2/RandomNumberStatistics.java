package level2;

import java.util.Scanner;

/*
 * Program Name : RandomNumberStatistics
 * Description  : Generates 4-digit random numbers and finds their
 *                average, minimum and maximum values
 */
public class RandomNumberStatistics {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);
        int size = 5;

        /* ---------------- Generate Random Numbers ---------------- */

        int[] randomNumbers = generate4DigitRandomArray(size);

        /* ---------------- Display Generated Numbers ---------------- */

        System.out.println("Generated 4-digit random numbers:");

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

        /* ---------------- Calculate Average, Min and Max ---------------- */

        double[] results = findAverageMinMax(randomNumbers);

        /* ---------------- Display Results ---------------- */

        System.out.println("\n\nAverage Value : " + results[0]);
        System.out.println("Minimum Value : " + (int) results[1]);
        System.out.println("Maximum Value : " + (int) results[2]);

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }

    /*
     * Method Name  : generate4DigitRandomArray
     * Description  : Generates an array of random 4-digit numbers
     * Parameter    : size
     * Return Type  : int[]
     */
    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {

            // Generate random 4-digit number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    /*
     * Method Name  : findAverageMinMax
     * Description  : Finds average, minimum and maximum of an array
     * Return Type  : double[] (index 0 = average, 1 = min, 2 = max)
     */
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        long sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            int current = numbers[i];

            sum += current;
            min = Math.min(min, current);
            max = Math.max(max, current);
        }

        double average = (double) sum / numbers.length;

        return new double[] { average, min, max };
    }
}

