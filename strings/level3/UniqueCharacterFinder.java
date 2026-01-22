package level3;

import java.util.Scanner;

public class UniqueCharacterFinder {

    private static final String TEXT_PROMPT = "Enter the text: ";

    /**
     * Finds string length without using length() method.
     */
    public static int findLengthWithoutLengthMethod(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException ignored) {
            // End of string reached
        }

        return count;
    }

    /**
     * Finds unique characters using charAt() and nested loops.
     */
    public static char[] findUniqueCharacters(String text) {

        int length = findLengthWithoutLengthMethod(text);

        // Temporary array to store unique characters
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if character already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount++] = currentChar;
            }
        }

        // Create final array with exact size
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = tempUnique[i];
        }

        return uniqueCharacters;
    }

    /**
     * Displays unique characters.
     */
    public static void displayUniqueCharacters(char[] uniqueChars) {

        System.out.println("\nUnique Characters:");

        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            char[] uniqueCharacters =
                    findUniqueCharacters(inputText);

            displayUniqueCharacters(uniqueCharacters);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

