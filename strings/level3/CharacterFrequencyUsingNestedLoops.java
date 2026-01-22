package level3;

import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    /**
     * Finds character frequencies using nested loops.
     * Returns a 1D String array in the format "character : frequency".
     */
    public static String[] findCharacterFrequencies(String text) {

        char[] characters = text.toCharArray();
        int length = characters.length;

        int[] frequency = new int[length];

        // Step 1: Initialize frequency array
        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
        }

        // Step 2: Nested loop to calculate frequencies
        for (int i = 0; i < length; i++) {

            if (characters[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0'; // Mark duplicate
                }
            }
        }

        // Step 3: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Step 4: Store results in 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (characters[i] != '0') {
                result[index++] = characters[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    /**
     * Displays the frequency result.
     */
    public static void displayResult(String[] frequencies) {

        System.out.println("\nCharacter Frequencies:");
        System.out.println("-----------------------");

        for (String entry : frequencies) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the text: ");
            String inputText = scanner.nextLine();

            String[] frequencies =
                    findCharacterFrequencies(inputText);

            displayResult(frequencies);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

