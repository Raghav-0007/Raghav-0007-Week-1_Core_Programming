import java.util.ArrayList;
import java.util.Arrays;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate a random card number between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n % x != 0) {
            System.out.println("Cannot distribute cards evenly among players.");
            return null;
        }

        // Calculate the number of cards per player
        int cardsPerPlayer = n / x;

        // 2D array to store players' cards
        String[][] players = new String[x][cardsPerPlayer];

        // Distribute the cards to players
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize deck
        String[] deck = initializeDeck();
        
        // Shuffle deck
        deck = shuffleDeck(deck);

        // Distribute the cards to 4 players, assuming 52 cards
        String[][] players = distributeCards(deck, 52, 4);
        
        // Print players and their cards
        if (players != null) {
            printPlayers(players);
        }
    }
}
