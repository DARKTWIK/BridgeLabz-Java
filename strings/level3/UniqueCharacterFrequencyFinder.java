package level3;

import java.util.Scanner;

public class UniqueCharacterFrequencyFinder {

    private static final int ASCII_SIZE = 256;

    /**
     * Finds unique characters using charAt() and nested loops.
     */
    public static char[] findUniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temp[i];
        }

        return uniqueCharacters;
    }

    /**
     * Finds frequency of characters using ASCII indexing and unique characters.
     */
    public static String[][] findCharacterFrequencyUsingUniqueChars(String text) {

        int[] frequency = new int[ASCII_SIZE];

        // Step 1: Count frequency of all characters
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Step 2: Get unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Step 3: Create result array
        String[][] result = new String[uniqueCharacters.length][2];

        for (int i = 0; i < uniqueCharacters.length; i++) {

            char ch = uniqueCharacters[i];

            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    /**
     * Displays character frequency table.
     */
    public static void displayFrequencies(String[][] frequencies) {

        System.out.println("\nCharacter Frequency Table (Using Unique Characters)");
        System.out.println("-------------------------------------------");
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------------------------");

        for (String[] row : frequencies) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the text: ");
            String inputText = scanner.nextLine();

            String[][] frequencies =
                    findCharacterFrequencyUsingUniqueChars(inputText);

            displayFrequencies(frequencies);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

