package extras1;

import java.util.Scanner;

public class LexicographicalStringComparator {

    /**
     * Compares two strings lexicographically.
     * Returns:
     *  -1 if first < second
     *   0 if equal
     *   1 if first > second
     */
    public static int compareStrings(String first, String second) {

        int minLength = Math.min(first.length(), second.length());

        for (int i = 0; i < minLength; i++) {

            char ch1 = first.charAt(i);
            char ch2 = second.charAt(i);

            if (ch1 < ch2) {
                return -1;
            } else if (ch1 > ch2) {
                return 1;
            }
        }

        // If all compared characters are equal, compare lengths
        if (first.length() < second.length()) {
            return -1;
        } else if (first.length() > second.length()) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);

        System.out.println();

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }

        scanner.close();
    }
}

