package level2;

import java.util.Scanner;

/*
 * Program Name : FriendAnalyzer
 * Description  : Finds the youngest and tallest among Amar, Akbar, and Anthony
 */
public class FriendAnalyzer {

    /*
     * Method Name  : findYoungestFriendIndex
     * Description  : Returns the index of the youngest friend
     */
    public static int findYoungestFriendIndex(int[] ages) {

        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        return youngestIndex;
    }

    /*
     * Method Name  : findTallestFriendIndex
     * Description  : Returns the index of the tallest friend
     */
    public static int findTallestFriendIndex(double[] heights) {

        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        return tallestIndex;
    }

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        String[] friendNames = { "Amar", "Akbar", "Anthony" };

        int totalFriends = friendNames.length;

        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];

        /* ---------------- Input Ages and Heights ---------------- */

        for (int i = 0; i < totalFriends; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.println("\nEnter details for " + friendNames[i]);

                // Input age
                System.out.print("Age: ");
                if (!scanner.hasNextInt()) {
                    System.err.println("Invalid age. Please enter an integer.");
                    scanner.next();
                    continue;
                }

                int ageInput = scanner.nextInt();

                if (ageInput <= 0) {
                    System.err.println("Age must be a positive number.");
                    continue;
                }

                // Input height
                System.out.print("Height (in cm): ");
                if (!scanner.hasNextDouble()) {
                    System.err.println("Invalid height. Please enter a numeric value.");
                    scanner.next();
                    continue;
                }

                double heightInput = scanner.nextDouble();

                if (heightInput <= 0) {
                    System.err.println("Height must be a positive value.");
                    continue;
                }

                ages[i] = ageInput;
                heights[i] = heightInput;
                isValidInput = true;
            }
        }

        /* ---------------- Find Youngest and Tallest ---------------- */

        int youngestIndex = findYoungestFriendIndex(ages);
        int tallestIndex = findTallestFriendIndex(heights);

        /* ---------------- Display Results ---------------- */

        System.out.println("\n========== Result ==========");
        System.out.println("Youngest Friend : " + friendNames[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend  : " + friendNames[tallestIndex] +
                " (Height: " + heights[tallestIndex] + " cm)");

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}

