package level1;

import java.util.Scanner;

public class LowerCaseConversionValidator {

    // Constant for prompt message
    private static final String TEXT_PROMPT = "Enter the complete text: ";

    /**
     * Converts a string to lowercase using charAt() and ASCII manipulation.
     *
     * @param text input string
     * @return lowercase string
     */
    public static String convertToLowerCaseUsingCharAt(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        StringBuilder lowerCaseBuilder = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char currentChar = text.charAt(index);

            // Check if character is uppercase (A–Z)
            if (currentChar >= 'A' && currentChar <= 'Z') {
                char lowerChar = (char) (currentChar + 32); // ASCII difference
                lowerCaseBuilder.append(lowerChar);
            } else {
                lowerCaseBuilder.append(currentChar);
            }
        }

        return lowerCaseBuilder.toString();
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

    private static void displayResults(String manualLowerCase,
                                       String builtInLowerCase,
                                       boolean comparisonResult) {

        System.out.println("\nLowercase Results:");
        System.out.println("Using charAt() method   : " + manualLowerCase);
        System.out.println("Using toLowerCase()     : " + builtInLowerCase);

        System.out.println("\nComparison Result:");
        System.out.println("Are both results equal? " + comparisonResult);
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String inputText = readInputText(scanner);

            String manualLowerCase =
                    convertToLowerCaseUsingCharAt(inputText);

            String builtInLowerCase =
                    inputText.toLowerCase();

            boolean areEqual =
                    compareStringsUsingCharAt(manualLowerCase, builtInLowerCase);

            displayResults(manualLowerCase, builtInLowerCase, areEqual);

        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

