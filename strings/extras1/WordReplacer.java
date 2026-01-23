package extras1;

import java.util.Scanner;

public class WordReplacer {

    /**
     * Replaces all occurrences of oldWord with newWord in the sentence.
     */
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        StringBuilder result = new StringBuilder();

        int i = 0;
        int sentenceLength = sentence.length();
        int oldWordLength = oldWord.length();

        while (i < sentenceLength) {

            boolean match = true;

            // Check if oldWord matches at current position
            if (i + oldWordLength <= sentenceLength) {

                for (int j = 0; j < oldWordLength; j++) {
                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        match = false;
                        break;
                    }
                }

            } else {
                match = false;
            }

            if (match) {
                // Replace old word with new word
                result.append(newWord);
                i += oldWordLength;
            } else {
                // Copy current character
                result.append(sentence.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("\nModified Sentence:");
        System.out.println(modifiedSentence);

        scanner.close();
    }
}

