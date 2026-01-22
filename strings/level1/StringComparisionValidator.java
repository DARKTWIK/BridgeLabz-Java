package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringComparisionValidator {

    // Constants for user prompts
    private static final String FIRST_STRING_PROMPT = "Enter first string: ";
    private static final String SECOND_STRING_PROMPT = "Enter second string: ";

    /**
     * Compares two strings character by character using charAt().
     *
     * @param firstString  first input string
     * @param secondString second input string
     * @return true if both strings are equal, otherwise false
     * @throws IllegalArgumentException if any string is null
     */
    public static boolean compareStringsUsingCharAt(String firstString, String secondString) {

        if (firstString == null || secondString == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }

        // If lengths differ, strings cannot be equal
        if (firstString.length() != secondString.length()) {
            return false;
        }

        // Compare character by character
        for (int index = 0; index < firstString.length(); index++) {
            if (firstString.charAt(index) != secondString.charAt(index)) {
                return false;
            }
        }

        return true;
    }

    private static String readStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    private static void displayResults(boolean manualResult, boolean builtInResult) {

        System.out.println("\nComparison Results:");
        System.out.println("Using charAt() method: " + manualResult);
        System.out.println("Using String.equals(): " + builtInResult);

        if (manualResult == builtInResult) {
            System.out.println("Result: Both methods produce the SAME output.");
        } else {
            System.out.println("Result: Outputs are DIFFERENT.");
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String firstInput = readStringInput(scanner, FIRST_STRING_PROMPT);
            String secondInput = readStringInput(scanner, SECOND_STRING_PROMPT);

            boolean manualComparisonResult =
                    compareStringsUsingCharAt(firstInput, secondInput);

            boolean builtInComparisonResult =
                    firstInput.equals(secondInput);

            displayResults(manualComparisonResult, builtInComparisonResult);

        } catch (InputMismatchException exception) {
            System.err.println("Invalid input provided.");
        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

