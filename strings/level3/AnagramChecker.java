package level3;

import java.util.Scanner;

public class AnagramChecker {

    private static final int ASCII_SIZE = 256;

    /**
     * Checks whether two texts are anagrams using character frequency method.
     */
    public static boolean areAnagrams(String text1, String text2) {

        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[ASCII_SIZE];
        int[] frequency2 = new int[ASCII_SIZE];

        // Step 2: Count character frequency for first text
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            frequency1[ch]++;
        }

        // Step 3: Count character frequency for second text
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            frequency2[ch]++;
        }

        // Step 4: Compare both frequency arrays
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first text: ");
            String firstText = scanner.nextLine();

            System.out.print("Enter second text: ");
            String secondText = scanner.nextLine();

            boolean result = areAnagrams(firstText, secondText);

            System.out.println("\nResult:");
            if (result) {
                System.out.println("The given texts are ANAGRAMS.");
            } else {
                System.out.println("The given texts are NOT anagrams.");
            }

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

