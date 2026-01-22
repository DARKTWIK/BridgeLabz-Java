package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterArrayValidator {

    // Constant prompt
    private static final String TEXT_PROMPT = "Enter the text: ";

    /**
     * Returns all characters in the given string using charAt().
     *
     * @param text input string
     * @return character array
     */
    public static char[] extractCharactersUsingCharAt(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        char[] characters = new char[text.length()];

        for (int index = 0; index < text.length(); index++) {
            characters[index] = text.charAt(index);
        }

        return characters;
    }

    /**
     * Compares two character arrays.
     *
     * @param first  first character array
     * @param second second character array
     * @return true if equal, otherwise false
     */
    public static boolean compareCharacterArrays(char[] first, char[] second) {

        if (first == null || second == null) {
            throw new IllegalArgumentException("Character arrays cannot be null.");
        }

        if (first.length != second.length) {
            return false;
        }

        for (int index = 0; index < first.length; index++) {
            if (first[index] != second[index]) {
                return false;
            }
        }

        return true;
    }

    private static String readInputText(Scanner scanner) {
        System.out.print(TEXT_PROMPT);
        return scanner.next();
    }

    private static void displayResults(char[] manualArray,
                                       char[] builtInArray,
                                       boolean comparisonResult) {

        System.out.println("\nCharacter Array using charAt():");
        printCharacterArray(manualArray);

        System.out.println("\nCharacter Array using toCharArray():");
        printCharacterArray(builtInArray);

        System.out.println("\nComparison Result:");
        System.out.println("Are both arrays equal? " + comparisonResult);
    }

    private static void printCharacterArray(char[] array) {
        for (char character : array) {
            System.out.print(character + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String inputText = readInputText(scanner);

            char[] manualCharacters =
                    extractCharactersUsingCharAt(inputText);

            char[] builtInCharacters =
                    inputText.toCharArray();

            boolean areEqual =
                    compareCharacterArrays(manualCharacters, builtInCharacters);

            displayResults(manualCharacters, builtInCharacters, areEqual);

        } catch (InputMismatchException exception) {
            System.err.println("Invalid input provided.");
        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}
