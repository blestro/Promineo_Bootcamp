package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	public String name;
	public int score;
	List<Card> hand = new ArrayList<Card>();

	public Player(String name) {
		this.name = name;
		this.score = 0;

	}
	
	public void describe() {
		System.out.println(name + "s score is " + score);
		
		for (Card c: hand) {
			c.describe();
		}
	}
	
	public Card flip() {
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
	}
	
	public void draw(Deck d) {
		hand.add(d.draw());
	}
	
	public void incrementScore() {
		score++;
	}
}
