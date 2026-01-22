package level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    /**
     * Method that intentionally generates IllegalArgumentException
     * by calling substring() with start index greater than end index.
     */
    public static void generateIllegalArgumentException(String text) {

        int startIndex = 5;
        int endIndex = 2;   // startIndex > endIndex (invalid)

        // This will throw IllegalArgumentException
        String result = text.substring(startIndex, endIndex);

        // This line will never execute
        System.out.println("Substring: " + result);
    }

    /**
     * Method that demonstrates handling of IllegalArgumentException
     * and generic RuntimeException using try-catch.
     */
    public static void handleIllegalArgumentException(String text) {

        int startIndex = 5;
        int endIndex = 2;   // startIndex > endIndex (invalid)

        try {
            String result = text.substring(startIndex, endIndex);
            System.out.println("Substring: " + result);

        } catch (IllegalArgumentException exception) {
            System.err.println("IllegalArgumentException caught successfully.");
            System.err.println("Reason: Start index is greater than end index.");

        } catch (RuntimeException exception) {
            System.err.println("RuntimeException caught.");
            System.err.println("Message: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String inputText = scanner.next();

            System.out.println("\nCalling method to generate IllegalArgumentException...\n");

            try {
                generateIllegalArgumentException(inputText);
            } catch (IllegalArgumentException exception) {
                System.err.println("Exception occurred in main while calling generator method.");
            }

            System.out.println("\nCalling method to handle IllegalArgumentException...\n");

            handleIllegalArgumentException(inputText);

            System.out.println("\nProgram execution completed.");

        }
    }
}

