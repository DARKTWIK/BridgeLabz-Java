package level2;

import java.util.Scanner;

public class VowelConsonantCounter {

    private static final String TEXT_PROMPT = "Enter the text: ";

    /**
     * Checks whether a character is a vowel, consonant, or not a letter.
     *
     * @param character input character
     * @return "Vowel", "Consonant", or "Not a Letter"
     */
    public static String classifyCharacter(char character) {

        // Convert uppercase to lowercase using ASCII
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }

        // Check if character is a letter
        if (character >= 'a' && character <= 'z') {

            // Check for vowels
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
     * Finds and counts vowels and consonants in a string using charAt().
     *
     * @param text input string
     * @return int array where [0] = vowel count, [1] = consonant count
     */
    public static int[] countVowelsAndConsonants(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        int vowelCount = 0;
        int consonantCount = 0;

        for (int index = 0; index < text.length(); index++) {

            char currentChar = text.charAt(index);
            String classification = classifyCharacter(currentChar);

            if ("Vowel".equals(classification)) {
                vowelCount++;
            } else if ("Consonant".equals(classification)) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            int[] result = countVowelsAndConsonants(inputText);

            System.out.println("\nResults:");
            System.out.println("Number of Vowels     : " + result[0]);
            System.out.println("Number of Consonants : " + result[1]);

        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

