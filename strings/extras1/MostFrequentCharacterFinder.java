import java.util.Scanner;

public class MostFrequentCharacterFinder {

    private static final int ASCII_SIZE = 256;

    public static char[] findMostFrequentCharacters(String text) {

        int[] frequency = new int[ASCII_SIZE];

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Step 2: Find maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
            }
        }

        // Step 3: Count how many characters have max frequency
        int count = 0;
        for (int i = 0; i < ASCII_SIZE; i++) {
            if (frequency[i] == maxFrequency) {
                count++;
            }
        }

        // Step 4: Store characters with max frequency
        char[] result = new char[count];
        int index = 0;

        for (int i = 0; i < ASCII_SIZE; i++) {
            if (frequency[i] == maxFrequency) {
                result[index++] = (char) i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("String is empty.");
        } else {

            char[] mostFrequentChars = findMostFrequentCharacters(input);

            System.out.print("\nMost Frequent Character(s): ");
            for (char c : mostFrequentChars) {
                System.out.print("'" + c + "' ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
