package warTheGame;

public class MainGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        //deck.describe();
       

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Draw cards and compare values
        for (int i = 0; i < 26; i++) {
            player1.playerDraw(deck);
            player2.playerDraw(deck);

            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println(player1.getName() + ": " + card1.getName() + " vs. " + player2.getName() + ": " + card2.getName());

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 scores.");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 scores.");
            } else {
                System.out.println("It's a tie!");
            }
        }

        // Compare final scores
        int score1 = player1.getScore();
        int score2 = player2.getScore();

        System.out.println("\nFinal Scores:");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score1 < score2) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}