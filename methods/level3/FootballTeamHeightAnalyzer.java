package level3;

/*
 * Program Name : FootballTeamHeightAnalyzer
 * Description  : Finds shortest, tallest and mean height of players in a football team
 */
public class FootballTeamHeightAnalyzer {

    private static final int TOTAL_PLAYERS = 11;
    private static final int MIN_HEIGHT = 150;
    private static final int MAX_HEIGHT = 250;

    public static void main(String[] args) {

        /* ---------------- Array Declaration ---------------- */

        int[] heights = new int[TOTAL_PLAYERS];

        /* ---------------- Generate Random Heights ---------------- */

        generateRandomHeights(heights);

        /* ---------------- Display Heights ---------------- */

        System.out.println("Heights of players (in cm):");

        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }

        /* ---------------- Calculations ---------------- */

        int sum = findSumOfHeights(heights);
        double mean = findMeanHeight(heights);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        /* ---------------- Display Results ---------------- */

        System.out.println("\n\n========== Team Height Statistics ==========");
        System.out.println("Shortest Height : " + shortest + " cm");
        System.out.println("Tallest Height  : " + tallest + " cm");
        System.out.printf("Mean Height     : %.2f cm%n", mean);
    }

    /*
     * Method Name  : generateRandomHeights
     * Description  : Generates random heights between 150 and 250 cm
     */
    public static void generateRandomHeights(int[] heights) {

        for (int i = 0; i < heights.length; i++) {

            heights[i] = (int) (Math.random() * (MAX_HEIGHT - MIN_HEIGHT + 1)) + MIN_HEIGHT;
        }
    }

    /*
     * Method Name  : findSumOfHeights
     */
    public static int findSumOfHeights(int[] heights) {

        int sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        return sum;
    }

    /*
     * Method Name  : findMeanHeight
     */
    public static double findMeanHeight(int[] heights) {

        int sum = findSumOfHeights(heights);
        return (double) sum / heights.length;
    }

    /*
     * Method Name  : findShortestHeight
     */
    public static int findShortestHeight(int[] heights) {

        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        return shortest;
    }

    /*
     * Method Name  : findTallestHeight
     */
    public static int findTallestHeight(int[] heights) {

        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }
}
