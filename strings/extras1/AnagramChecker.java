package extras1;

import java.util.Scanner;

public class AnagramChecker {

    private static final int ASCII_SIZE = 256;

    /**
     * Checks whether two strings are anagrams.
     */
    public static boolean areAnagrams(String text1, String text2) {

        // Step 1: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[ASCII_SIZE];
        int[] frequency2 = new int[ASCII_SIZE];

        // Step 2: Count frequency for first string
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Step 3: Count frequency for second string
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Step 4: Compare frequencies
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = scanner.nextLine();

        System.out.print("Enter second string: ");
        String second = scanner.nextLine();

        boolean result = areAnagrams(first, second);

        System.out.println();

        if (result) {
            System.out.println("The strings are ANAGRAMS.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        scanner.close();
    }
}

