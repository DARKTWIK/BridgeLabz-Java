package level3;

import java.util.Scanner;

public class CharacterFrequencyFinder {

    private static final int ASCII_SIZE = 256;

    /**
     * Finds frequency of characters using charAt() and ASCII indexing.
     *
     * @param text input string
     * @return 2D array of characters and their frequencies
     */
    public static String[][] findCharacterFrequencies(String text) {

        if (text == null || text.isEmpty()) {
            return new String[0][0];
        }

        int[] frequency = new int[ASCII_SIZE];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Step 2: Count unique characters (for 2D array size)
        boolean[] visited = new boolean[ASCII_SIZE];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (!visited[currentChar]) {
                visited[currentChar] = true;
                uniqueCount++;
            }
        }

        // Step 3: Create 2D array for result
        String[][] result = new String[uniqueCount][2];

        int index = 0;
        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);

            if (frequency[currentChar] > 0) {

                result[index][0] = String.valueOf(currentChar);
                result[index][1] = String.valueOf(frequency[currentChar]);

                frequency[currentChar] = 0; // Avoid duplicates
                index++;
            }
        }

        return result;
    }

    /**
     * Displays character frequencies.
     */
    public static void displayFrequencies(String[][] frequencies) {

        System.out.println("\nCharacter Frequency Table:");
        System.out.println("---------------------------");
        System.out.println("Character\tFrequency");
        System.out.println("---------------------------");

        for (String[] row : frequencies) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the text: ");
            String inputText = scanner.nextLine();

            String[][] frequencies =
                    findCharacterFrequencies(inputText);

            displayFrequencies(frequencies);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

