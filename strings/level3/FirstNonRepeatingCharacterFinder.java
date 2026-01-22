package level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacterFinder {

    private static final int ASCII_SIZE = 256;

    /**
     * Finds the first non-repeating character using charAt() and frequency array.
     *
     * @param text input string
     * @return first non-repeating character or '\0' if none found
     */
    public static char findFirstNonRepeatingCharacter(String text) {

        if (text == null || text.isEmpty()) {
            return '\0';
        }

        int[] frequency = new int[ASCII_SIZE];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Step 2: Find first character with frequency = 1
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (frequency[currentChar] == 1) {
                return currentChar;
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the text: ");
            String inputText = scanner.nextLine();

            char result = findFirstNonRepeatingCharacter(inputText);

            if (result != '\0') {
                System.out.println("\nFirst non-repeating character: " + result);
            } else {
                System.out.println("\nNo non-repeating character found in the string.");
            }

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

