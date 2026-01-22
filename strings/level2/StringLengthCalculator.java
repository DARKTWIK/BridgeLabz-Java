package level2;

import java.util.Scanner;

public class StringLengthCalculator {

    private static final String TEXT_PROMPT = "Enter a text: ";

    /**
     * Finds the length of a string without using the built-in length() method.
     * Uses an infinite loop and stops when charAt() throws an exception.
     *
     * @param text input string
     * @return length of the string
     */
    public static int findLengthWithoutUsingLengthMethod(String text) {

        if (text == null) {
            throw new IllegalArgumentException("Input text cannot be null.");
        }

        int count = 0;

        try {
            while (true) {
                text.charAt(count); // Will throw exception when index is out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // Loop termination when end of string is reached
        }

        return count;
    }

    private static String readInputText(Scanner scanner) {
        System.out.print(TEXT_PROMPT);
        return scanner.next();
    }

    private static void displayResults(int manualLength, int builtInLength) {

        System.out.println("\nString Length Results:");
        System.out.println("Using user-defined method : " + manualLength);
        System.out.println("Using built-in length()   : " + builtInLength);

        if (manualLength == builtInLength) {
            System.out.println("Result: Both lengths are equal.");
        } else {
            System.out.println("Result: Lengths are different.");
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String inputText = readInputText(scanner);

            int manualLength =
                    findLengthWithoutUsingLengthMethod(inputText);

            int builtInLength =
                    inputText.length();

            displayResults(manualLength, builtInLength);

        } catch (IllegalArgumentException exception) {
            System.err.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

