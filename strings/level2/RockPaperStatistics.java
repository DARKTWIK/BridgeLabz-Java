package level2;

import java.util.Scanner;

public class RockPaperStatistics {

    private static final String[] CHOICES = {"Rock", "Paper", "Scissors"};

    /* Generate computer choice using Math.random() */
    public static String getComputerChoice() {
        int index = (int) (Math.random() * 3);
        return CHOICES[index];
    }

    /* Determine winner of one game */
    public static String findWinner(String userChoice, String computerChoice) {

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        }

        if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
            return "User";
        }

        return "Computer";
    }

    /* Calculate win statistics */
    public static String[][] calculateStatistics(int userWins, int computerWins, int totalGames) {

        double userPercentage = ((double) userWins / totalGames) * 100;
        double computerPercentage = ((double) computerWins / totalGames) * 100;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", computerPercentage);

        return stats;
    }

    /* Display game results and statistics */
    public static void displayResults(String[][] gameResults, String[][] statistics) {

        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("\nWin Statistics:");
        System.out.println("Player\tWins\tWinning %");
        System.out.println("------------------------------");

        for (String[] row : statistics) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "%");
        }
    }

    /* Validate user input */
    private static String getValidUserChoice(Scanner scanner) {

        while (true) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("Rock") ||
                    input.equalsIgnoreCase("Paper") ||
                    input.equalsIgnoreCase("Scissors")) {
                return input;
            }

            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of games to play: ");
            int numberOfGames = scanner.nextInt();

            String[][] gameResults = new String[numberOfGames][3];

            int userWins = 0;
            int computerWins = 0;

            for (int i = 0; i < numberOfGames; i++) {

                System.out.println("\nGame " + (i + 1));

                String userChoice = getValidUserChoice(scanner);
                String computerChoice = getComputerChoice();

                String winner = findWinner(userChoice, computerChoice);

                if (winner.equals("User")) userWins++;
                if (winner.equals("Computer")) computerWins++;

                gameResults[i][0] = userChoice;
                gameResults[i][1] = computerChoice;
                gameResults[i][2] = winner;
            }

            String[][] statistics =
                    calculateStatistics(userWins, computerWins, numberOfGames);

            displayResults(gameResults, statistics);

        } catch (Exception exception) {
            System.err.println("Unexpected error occurred: " + exception.getMessage());
        }
    }
}

