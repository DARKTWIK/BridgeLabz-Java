package level1;

import java.util.Scanner;

public class UpperCaseConversionValidator {

    // Constant for prompt
    private static final String TEXT_PROMPT = "Enter the complete text: ";

    /**
     * Converts a string to uppercase using charAt() and ASCII manipulation.
     *
     * @param text input string
     * @return uppercase string
     */
    public static String convertToUpperCaseUsingCharAt(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        StringBuilder upperCaseBuilder = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);

            // Check if character is lowercase (a–z)
            if (currentChar >= 'a' && currentChar <= 'z') {
                char upperChar = (char) (currentChar - 32); // ASCII difference
                upperCaseBuilder.append(upperChar);
            } else {
                upperCaseBuilder.append(currentChar);
            }
        }

        return upperCaseBuilder.toString();
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

    private static String readInputText(Scanner scanner) {
        System.out.print(TEXT_PROMPT);
        return scanner.nextLine();
    }

    private static void displayResults(String manualUpperCase,
                                       String builtInUpperCase,
                                       boolean comparisonResult) {

        System.out.println("\nUppercase Results:");
        System.out.println("Using charAt() method   : " + manualUpperCase);
        System.out.println("Using toUpperCase()    : " + builtInUpperCase);

        System.out.println("\nComparison Result:");
        System.out.println("Are both results equal? " + comparisonResult);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String inputText = readInputText(scanner);

            String manualUpperCase =
                    convertToUpperCaseUsingCharAt(inputText);

            String builtInUpperCase =
                    inputText.toUpperCase();

            boolean areEqual =
                    compareStringsUsingCharAt(manualUpperCase, builtInUpperCase);

            displayResults(manualUpperCase, builtInUpperCase, areEqual);

        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

