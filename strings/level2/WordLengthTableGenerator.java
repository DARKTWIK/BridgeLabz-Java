package level2;

import java.util.Scanner;

public class WordLengthTableGenerator {

    private static final String TEXT_PROMPT = "Enter the complete text: ";

    /**
     * Finds string length without using length().
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
     * Splits text into words using charAt().
     */
    public static String[] splitTextIntoWordsUsingCharAt(String text) {

        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        int length = findLengthWithoutLengthMethod(text);

        // Count spaces
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        // Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int spaceIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int startIndex = 0;

        for (int w = 0; w < wordCount; w++) {

            int endIndex = (w < spaceCount) ? spaceIndexes[w] : length;

            StringBuilder wordBuilder = new StringBuilder();

            for (int c = startIndex; c < endIndex; c++) {
                wordBuilder.append(text.charAt(c));
            }

            words[w] = wordBuilder.toString();
            startIndex = endIndex + 1;
        }

        return words;
    }

    /**
     * Converts word array into 2D array with word and its length.
     */
    public static String[][] generateWordLengthTable(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            int length = findLengthWithoutLengthMethod(words[i]);

            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    /**
     * Displays the 2D array in tabular format.
     */
    public static void displayTable(String[][] table) {

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (String[] row : table) {

            String word = row[0];
            int length = Integer.parseInt(row[1]); // Convert back to int

            System.out.println(word + "\t\t" + length);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            String[] words =
                    splitTextIntoWordsUsingCharAt(inputText);

            String[][] wordLengthTable =
                    generateWordLengthTable(words);

            displayTable(wordLengthTable);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

