package week6;

public class App {

	public static void main(String[] args) {
		// instantiate players and deck
		Player player1 = new Player("Samir");
		Player player2 = new Player("Arleth");
		
		Deck deck = new Deck();
		// call shuffle on deck
		deck.shuffle();
		
		// for every even number, player1 draws a card. player2 draws on odd
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		// printing out their cards
		player1.describe();
		player2.describe();
//		player1.hand.forEach( (n) -> {System.out.println(n.getValue()); });
//		player2.hand.forEach( (n) -> {System.out.println(n.getValue()); });
		
		// calling flip method and also comparing the cards of the players
		System.err.println("\n--------Game has Started--------");
		for (int f = 0; f < 26; f++) {
			Card player1Card = player1.flip();
			player1Card.describe();
			Card player2Card = player2.flip();
			player2Card.describe();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 W: " + player1Card.getValue() + " > " + player2Card.getValue());
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println("Player 2 W: " + player2Card.getValue() + " > " + player1Card.getValue());
			} else {
				System.out.println("Draw, no points given. " + player2Card.getValue() + " = " + player1Card.getValue());
			}
			System.out.println("Player 1 Score: " + player1.score);
			System.out.println("Player 2 Score: " + player2.score);
		}
		System.out.println("Playe1: " + player1.score);
		System.out.println("Playe2: " + player2.score);
		if (player1.score > player2.score) {
			System.out.println("Player 1 Won: " + player1.name);
		} else if (player1.score < player2.score) {
			System.out.println("Player 2 Won: " + player2.name);
		} else {
			System.out.println("Draw");
		}
		
	}

}
