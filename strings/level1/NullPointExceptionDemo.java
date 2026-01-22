package level1;

public class NullPointExceptionDemo {

    /**
     * Method that intentionally generates NullPointerException.
     * Defines a String variable as null and calls a String method.
     */
    public static void generateNullPointerException() {

        String text = null;   // Initialized to null

        // This line will throw NullPointerException
        int length = text.length();

        // This line will never execute
        System.out.println("Length of text: " + length);
    }

    /**
     * Method that demonstrates handling of NullPointerException
     * using try-catch block.
     */
    public static void handleNullPointerException() {

        String text = null;   // Initialized to null

        try {
            int length = text.length();  // Exception occurs here
            System.out.println("Length of text: " + length);

        } catch (NullPointerException exception) {
            System.err.println("NullPointerException caught successfully.");
            System.err.println("Reason: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method to generate NullPointerException...\n");

        try {
            generateNullPointerException();
        } catch (NullPointerException exception) {
            System.err.println("Exception occurred in main while calling generator method.");
        }

        System.out.println("\nRefactored code: Handling NullPointerException using try-catch...\n");

        handleNullPointerException();

        System.out.println("\nProgram execution completed.");
    }
}

