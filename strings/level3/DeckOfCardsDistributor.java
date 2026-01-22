package level3;

import java.util.Scanner;

public class DeckOfCardsDistributor {

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    /* Calculate number of cards */
    public static int getNumberOfCards() {
        return SUITS.length * RANKS.length;
    }

    /* Initialize deck */
    public static String[] initializeDeck() {

        int numOfCards = getNumberOfCards();
        String[] deck = new String[numOfCards];

        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    /* Shuffle deck using given algorithm */
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    /* Distribute cards to players */
    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers) {

        if (numberOfCards > deck.length || numberOfCards % numberOfPlayers != 0) {
            return null;
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;

        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int cardIndex = 0;

        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    /* Print players and their cards */
    public static void printPlayersCards(String[][] players) {

        for (int i = 0; i < players.length; i++) {

            System.out.println("\nPlayer " + (i + 1) + " cards:");

            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter number of players: ");
            int numberOfPlayers = scanner.nextInt();

            System.out.print("Enter number of cards to distribute: ");
            int numberOfCardsToDistribute = scanner.nextInt();

            String[] deck = initializeDeck();
            deck = shuffleDeck(deck);

            String[][] players =
                    distributeCards(deck, numberOfCardsToDistribute, numberOfPlayers);

            if (players == null) {
                System.out.println("\nCards cannot be evenly distributed among players.");
            } else {
                printPlayersCards(players);
            }

        } catch (Exception exception) {
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
}

