package level1;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    /**
     * Method that intentionally generates StringIndexOutOfBoundsException.
     *
     * @param text input string
     */
    public static void generateStringIndexOutOfBoundsException(String text) {

        int invalidIndex = text.length();  // Out of valid range (0 to length-1)

        // This will throw StringIndexOutOfBoundsException
        char character = text.charAt(invalidIndex);

        // This line will never execute
        System.out.println("Character at index " + invalidIndex + ": " + character);
    }

    /**
     * Method that demonstrates handling of StringIndexOutOfBoundsException
     * using try-catch block.
     *
     * @param text input string
     */
    public static void handleStringIndexOutOfBoundsException(String text) {

        int invalidIndex = text.length();  // Out of valid range

        try {
            char character = text.charAt(invalidIndex);
            System.out.println("Character at index " + invalidIndex + ": " + character);

        } catch (StringIndexOutOfBoundsException exception) {
            System.err.println("StringIndexOutOfBoundsException caught successfully.");
            System.err.println("Reason: Attempted to access index " + invalidIndex
                    + " but valid range is 0 to " + (text.length() - 1));
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a string: ");
            String inputText = scanner.next();

            System.out.println("\nCalling method to generate StringIndexOutOfBoundsException...\n");

            try {
                generateStringIndexOutOfBoundsException(inputText);
            } catch (StringIndexOutOfBoundsException exception) {
                System.err.println("Exception occurred in main while calling generator method.");
            }

            System.out.println("\nCalling method to handle StringIndexOutOfBoundsException...\n");

            handleStringIndexOutOfBoundsException(inputText);

            System.out.println("\nProgram execution completed.");

        }
    }
}
