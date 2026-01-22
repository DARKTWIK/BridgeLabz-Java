package level2;

import java.util.Scanner;

public class StringTrimValidator {

    private static final String TEXT_PROMPT = "Enter the text with leading and trailing spaces: ";

    /**
     * Finds the start and end indexes after trimming leading and trailing spaces.
     *
     * @param text input string
     * @return int array where [0] = startIndex, [1] = endIndex (exclusive)
     */
    public static int[] findTrimIndexesUsingCharAt(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        int startIndex = 0;
        int endIndex = text.length() - 1;

        // Trim leading spaces
        while (startIndex <= endIndex && text.charAt(startIndex) == ' ') {
            startIndex++;
        }

        // Trim trailing spaces
        while (endIndex >= startIndex && text.charAt(endIndex) == ' ') {
            endIndex--;
        }

        return new int[]{startIndex, endIndex + 1}; // end index is exclusive
    }

    /**
     * Creates substring using charAt().
     */
    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {

        StringBuilder result = new StringBuilder();

        for (int index = startIndex; index < endIndex; index++) {
            result.append(text.charAt(index));
        }

        return result.toString();
    }

    /**
     * Compares two strings using charAt().
     */
    public static boolean compareStringsUsingCharAt(String first, String second) {

        if (first == null || second == null) {
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }

        for (int index = 0; index < first.length(); index++) {
            if (first.charAt(index) != second.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            // User-defined trimming
            int[] trimIndexes = findTrimIndexesUsingCharAt(inputText);
            String manualTrimmedText =
                    createSubstringUsingCharAt(inputText, trimIndexes[0], trimIndexes[1]);

            // Built-in trimming
            String builtInTrimmedText = inputText.trim();

            // Comparison
            boolean isEqual =
                    compareStringsUsingCharAt(manualTrimmedText, builtInTrimmedText);

            // Display results
            System.out.println("\nResults:");
            System.out.println("Using charAt() trim : \"" + manualTrimmedText + "\"");
            System.out.println("Using String.trim(): \"" + builtInTrimmedText + "\"");
            System.out.println("Are both results equal? " + isEqual);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

