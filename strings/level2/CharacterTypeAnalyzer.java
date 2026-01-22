package level2;

import java.util.Scanner;

public class CharacterTypeAnalyzer {

    private static final String TEXT_PROMPT = "Enter the text: ";

    /**
     * Classifies a character as Vowel, Consonant, or Not a Letter.
     */
    public static String classifyCharacter(char character) {

        // Convert uppercase to lowercase using ASCII
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check if letter
        if (character >= 'a' && character <= 'z') {

            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    /**
     * Creates a 2D array with character and its classification.
     */
    public static String[][] analyzeCharacters(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        String[][] result = new String[text.length()][2];

        for (int index = 0; index < text.length(); index++) {

            char currentChar = text.charAt(index);

            result[index][0] = String.valueOf(currentChar);
            result[index][1] = classifyCharacter(currentChar);
        }

        return result;
    }

    /**
     * Displays the 2D array in tabular format.
     */
    public static void displayTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        System.out.println("----------------------------");

        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            String[][] analysisResult = analyzeCharacters(inputText);

            displayTable(analysisResult);

        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

