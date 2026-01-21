import java.util.Scanner;

/*
 * Program Name : FriendAgeHeightAnalyzer
 * Description  : Determines the youngest and tallest among
 *                Amar, Akbar, and Anthony
 */
class FriendAgeHeightAnalyzer {

    public static void main(String[] args) {

        /* ---------------- Variable Declarations ---------------- */

        Scanner scanner = new Scanner(System.in);

        String[] friendNames = { "Amar", "Akbar", "Anthony" };

        int totalFriends = friendNames.length;

        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];

        /* ---------------- Input Ages and Heights with Validation ---------------- */

        for (int i = 0; i < totalFriends; i++) {

            boolean isValidInput = false;

            while (!isValidInput) {

                System.out.println("\nEnter details for " + friendNames[i]);

                // Input and validate age
                System.out.print("Age: ");

                if (!scanner.hasNextInt()) {
                    System.err.println("Error: Invalid age. Please enter a valid integer.");
                    scanner.next();
                    continue;
                }

                int ageInput = scanner.nextInt();

                if (ageInput <= 0) {
                    System.err.println("Error: Age must be a positive number.");
                    continue;
                }

                // Input and validate height
                System.out.print("Height (in cm): ");

                if (!scanner.hasNextDouble()) {
                    System.err.println("Error: Invalid height. Please enter a valid number.");
                    scanner.next();
                    continue;
                }

                double heightInput = scanner.nextDouble();

                if (heightInput <= 0) {
                    System.err.println("Error: Height must be a positive number.");
                    continue;
                }

                // Store valid inputs
                ages[i] = ageInput;
                heights[i] = heightInput;
                isValidInput = true;
            }
        }

        /* ---------------- Find Youngest and Tallest ---------------- */

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < totalFriends; i++) {

            // Check for youngest age
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest height
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        /* ---------------- Display Results ---------------- */

        System.out.println("\n========== Result ==========");
        System.out.println("Youngest Friend : " + friendNames[youngestIndex]
                + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend  : " + friendNames[tallestIndex]
                + " (Height: " + heights[tallestIndex] + " cm)");

        /* ---------------- Resource Cleanup ---------------- */

        scanner.close();
    }
}
