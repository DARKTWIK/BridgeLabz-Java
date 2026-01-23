package level2;

import java.util.Scanner;

public class NumberGuessingGame {

    // Generate computer guess within current range
    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    // Get user feedback
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Enter feedback (high / low / correct): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    // Update range based on feedback
    public static int[] updateRange(int guess, int low, int high, String feedback) {

        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }

        return new int[]{low, high};
    }

    public static void startGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("Provide feedback as: high, low, or correct.\n");

        int low = 1;
        int high = 100;
        int attempts = 0;

        while (true) {

            int guess = generateGuess(low, high);
            attempts++;

            System.out.println("My guess: " + guess);

            String feedback = getUserFeedback(scanner);

            if (feedback.equals("correct")) {
                System.out.println("\n🎉 I guessed your number in " + attempts + " attempts!");
                break;
            }

            if (!feedback.equals("high") && !feedback.equals("low")) {
                System.out.println("Invalid input. Please enter: high, low, or correct.");
                attempts--;
                continue;
            }

            int[] newRange = updateRange(guess, low, high, feedback);
            low = newRange[0];
            high = newRange[1];

            if (low > high) {
                System.out.println("Something went wrong. Are you sure about your answers?");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        startGame();
    }
}
