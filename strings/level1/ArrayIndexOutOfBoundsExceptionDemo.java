package level1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    /**
     * Method that intentionally generates ArrayIndexOutOfBoundsException
     * by accessing an index greater than the array length.
     */
    public static void generateArrayIndexOutOfBoundsException(String[] names) {

        int invalidIndex = names.length; // Valid indexes: 0 to length-1

        // This will throw ArrayIndexOutOfBoundsException
        String value = names[invalidIndex];

        // This line will never execute
        System.out.println("Name at index " + invalidIndex + ": " + value);
    }

    /**
     * Method that demonstrates handling of ArrayIndexOutOfBoundsException
     * and generic RuntimeException using try-catch.
     */
    public static void handleArrayIndexOutOfBoundsException(String[] names) {

        int invalidIndex = names.length;

        try {
            String value = names[invalidIndex];
            System.out.println("Name at index " + invalidIndex + ": " + value);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("ArrayIndexOutOfBoundsException caught successfully.");
            System.err.println("Reason: Attempted to access index " + invalidIndex
                    + " but valid range is 0 to " + (names.length - 1));

        } catch (RuntimeException exception) {
            System.err.println("RuntimeException caught.");
            System.err.println("Message: " + exception.getMessage());
        }
    }

    /**
     * Reads names from the user and stores them in an array.
     */
    private static String[] readNames(Scanner scanner) {

        System.out.print("Enter number of names: ");
        int count = scanner.nextInt();

        String[] names = new String[count];

        for (int index = 0; index < count; index++) {
            System.out.print("Enter name " + (index + 1) + ": ");
            names[index] = scanner.next();
        }

        return names;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String[] names = readNames(scanner);

            System.out.println("\nCalling method to generate ArrayIndexOutOfBoundsException...\n");

            try {
                generateArrayIndexOutOfBoundsException(names);
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.err.println("Exception occurred in main while calling generator method.");
            }

            System.out.println("\nCalling method to handle ArrayIndexOutOfBoundsException...\n");

            handleArrayIndexOutOfBoundsException(names);

            System.out.println("\nProgram execution completed.");

        } catch (InputMismatchException exception) {
            System.err.println("Invalid input type provided.");
        }
    }
}

