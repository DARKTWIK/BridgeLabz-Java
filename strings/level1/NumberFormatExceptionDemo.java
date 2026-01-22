package level1;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    /**
     * Method that intentionally generates NumberFormatException
     * by attempting to parse a non-numeric string.
     */
    public static void generateNumberFormatException(String text) {

        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);

        // This line will never execute if exception occurs
        System.out.println("Parsed number: " + number);
    }

    /**
     * Method that demonstrates handling of NumberFormatException
     * and generic RuntimeException using try-catch.
     */
    public static void handleNumberFormatException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);

        } catch (NumberFormatException exception) {
            System.err.println("NumberFormatException caught successfully.");
            System.err.println("Reason: Input text is not a valid integer.");

        } catch (RuntimeException exception) {
            System.err.println("RuntimeException caught.");
            System.err.println("Message: " + exception.getMessage());
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a value: ");
            String inputText = scanner.next();

            System.out.println("\nCalling method to generate NumberFormatException...\n");

            try {
                generateNumberFormatException(inputText);
            } catch (NumberFormatException exception) {
                System.err.println("Exception occurred in main while calling generator method.");
            }

            System.out.println("\nCalling method to handle NumberFormatException...\n");

            handleNumberFormatException(inputText);

            System.out.println("\nProgram execution completed.");

        }
    }
}

