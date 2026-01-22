package level2;

import java.util.Scanner;

public class ShortestAndLongestWordFinder {

    private static final String TEXT_PROMPT = "Enter the complete text: ";

    /* Find string length without using length() */
    public static int findLengthWithoutLengthMethod(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException ignored) {
        }

        return count;
    }

    /* Split text into words using charAt() */
    public static String[] splitTextIntoWordsUsingCharAt(String text) {

        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        int length = findLengthWithoutLengthMethod(text);

        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int wordCount = spaceCount + 1;

        int[] spaceIndexes = new int[spaceCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

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

    /* Create 2D array of word and its length */
    public static String[][] generateWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            int length = findLengthWithoutLengthMethod(words[i]);

            table[i][0] = words[i];
            table[i][1] = String.valueOf(length);
        }

        return table;
    }

    /* Find shortest and longest word indexes */
    public static int[] findShortestAndLongestIndexes(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int shortestLength = Integer.parseInt(table[0][1]);
        int longestLength = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {

            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    /* Display results */
    public static void displayResults(String[][] table, int[] indexes) {

        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");

        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + Integer.parseInt(row[1]));
        }

        System.out.println("\nResults:");
        System.out.println("Shortest Word : " + table[indexes[0]][0]
                + " (Length = " + table[indexes[0]][1] + ")");

        System.out.println("Longest Word  : " + table[indexes[1]][0]
                + " (Length = " + table[indexes[1]][1] + ")");
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print(TEXT_PROMPT);
            String inputText = scanner.nextLine();

            String[] words =
                    splitTextIntoWordsUsingCharAt(inputText);

            String[][] wordLengthTable =
                    generateWordLengthTable(words);

            int[] shortestAndLongestIndexes =
                    findShortestAndLongestIndexes(wordLengthTable);

            displayResults(wordLengthTable, shortestAndLongestIndexes);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}
