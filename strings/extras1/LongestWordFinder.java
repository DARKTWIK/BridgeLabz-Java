package extras1;

import java.util.Scanner;

public class LongestWordFinder {

    public static String findLongestWord(String sentence) {

        String longestWord = "";
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            // If character is not space, build the word
            if (ch != ' ') {
                currentWord.append(ch);
            }
            // If space encountered, check current word
            else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                currentWord.setLength(0); // reset for next word
            }
        }

        // Check last word (if sentence does not end with space)
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord.toString();
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String longestWord = findLongestWord(inputSentence);

        System.out.println("\nLongest word in the sentence:");
        System.out.println(longestWord);

        scanner.close();
    }
}

