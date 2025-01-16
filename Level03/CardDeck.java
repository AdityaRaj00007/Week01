import java.util.*;

public class CardDeck {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        // Generate the deck by combining each rank with each suit
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + rand.nextInt(deck.length - i);
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        if (numOfPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0];
        }
        
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        int index = 0;
        
        // Distribute the cards
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[index++];
            }
        }
        return playersCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (String card : playersCards[i]) {
                System.out.println(card);
            }
            System.out.println(); // Empty line for separation
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        System.out.print("Enter the number of players: ");
        int numOfPlayers = input.nextInt();
        
        System.out.print("Enter the number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        String[][] playersCards = distributeCards(deck, numOfPlayers, cardsPerPlayer);

        printPlayersCards(playersCards);
        
        input.close();
    }
}
