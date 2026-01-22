package level2;

import java.util.Scanner;

public class WordSplitValidator {

    private static final String TEXT_PROMPT = "Enter the complete text: ";

    /**
     * Finds length of a string without using length().
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
     * Splits text into words using charAt() without split().
     */
    public static String[] splitTextIntoWordsUsingCharAt(String text) {

        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        int length = findLengthWithoutLengthMethod(text);

        /* Step 1: Count spaces (word count = spaces + 1) */
        int spaceCount = 0;
        for (int index = 0; index < length; index++) {
            if (text.charAt(index) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        /* Step 2: Store space indexes */
        int[] spaceIndexes = new int[spaceCount];
        int spaceArrayIndex = 0;

        for (int index = 0; index < length; index++) {
            if (text.charAt(index) == ' ') {
                spaceIndexes[spaceArrayIndex++] = index;
            }
        }

        /* Step 3: Extract words using indexes */
        String[] words = new String[wordCount];

        int startIndex = 0;

        for (int wordIndex = 0; wordIndex < wordCount; wordIndex++) {

            int endIndex = (wordIndex < spaceCount)
                    ? spaceIndexes[wordIndex]
                    : length;

            StringBuilder wordBuilder = new StringBuilder();

            for (int charIndex = startIndex; charIndex < endIndex; charIndex++) {
                wordBuilder.append(text.charAt(charIndex));
            }

            words[wordIndex] = wordBuilder.toString();
            startIndex = endIndex + 1;
        }

        return words;
    }

    /**
     * Compares two string arrays.
     */
    public static boolean compareStringArrays(String[] first, String[] second) {

        if (first == null || second == null || first.length != second.length) {
            return false;
        }

        for (int index = 0; index < first.length; index++) {
            if (!first[index].equals(second[index])) {
                return false;
            }
        }

        return true;
    }

    private static void displayResults(String[] manualWords,
                                       String[] builtInWords,
                                       boolean comparisonResult) {

        System.out.println("\nWords using user-defined method:");
        printArray(manualWords);

        System.out.println("\nWords using split() method:");
        printArray(builtInWords);

        System.out.println("\nComparison Result:");
        System.out.println("Are both word arrays equal? " + comparisonResult);
    }

    private static void printArray(String[] array) {
        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            String[] manualWords =
                    splitTextIntoWordsUsingCharAt(inputText);

            String[] builtInWords =
                    inputText.split(" ");

            boolean areEqual =
                    compareStringArrays(manualWords, builtInWords);

            displayResults(manualWords, builtInWords, areEqual);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

