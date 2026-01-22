package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubstringComparisonValidator {

    // Constants for user prompts
    private static final String STRING_PROMPT = "Enter the text: ";
    private static final String START_INDEX_PROMPT = "Enter start index: ";
    private static final String END_INDEX_PROMPT = "Enter end index: ";

    /**
     * Creates a substring manually using charAt().
     *
     * @param text       source string
     * @param startIndex starting index (inclusive)
     * @param endIndex   ending index (exclusive)
     * @return generated substring
     */
    public static String createSubstringUsingCharAt(String text, int startIndex, int endIndex) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index.");
        }

        StringBuilder substringBuilder = new StringBuilder();

        for (int index = startIndex; index < endIndex; index++) {
            substringBuilder.append(text.charAt(index));
        }

        return substringBuilder.toString();
    }

    /**
     * Compares two strings using charAt().
     *
     * @param first  first string
     * @param second second string
     * @return true if equal, otherwise false
     */
    public static boolean compareStringsUsingCharAt(String first, String second) {

        if (first == null || second == null) {
            throw new IllegalArgumentException("Strings cannot be null.");
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

    private static String readText(Scanner scanner) {
        System.out.print(STRING_PROMPT);
        return scanner.next();
    }

    private static int readIndex(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static void displayResults(String manualSubstring,
                                       String builtInSubstring,
                                       boolean comparisonResult) {

        System.out.println("\nGenerated Substrings:");
        System.out.println("Using charAt() : " + manualSubstring);
        System.out.println("Using substring(): " + builtInSubstring);

        System.out.println("\nComparison Result:");
        System.out.println("Are both substrings equal? " + comparisonResult);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String inputText = readText(scanner);
            int startIndex = readIndex(scanner, START_INDEX_PROMPT);
            int endIndex = readIndex(scanner, END_INDEX_PROMPT);

            String manualSubstring =
                    createSubstringUsingCharAt(inputText, startIndex, endIndex);

            String builtInSubstring =
                    inputText.substring(startIndex, endIndex);

            boolean areEqual =
                    compareStringsUsingCharAt(manualSubstring, builtInSubstring);

            displayResults(manualSubstring, builtInSubstring, areEqual);

        } catch (InputMismatchException exception) {
            System.err.println("Invalid input type. Please enter correct values.");
        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

