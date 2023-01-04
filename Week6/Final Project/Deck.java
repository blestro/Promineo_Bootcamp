package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
		for (int c = 2; c <= 14; c++) {
			for (int s = 0; s <= 3; s++) {
				cards.add(new Card(c, suits[s]));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if (cards.isEmpty()) {
			return null;
		} else {
			Card topCard = cards.get(0);
			cards.remove(0);
			return topCard;
		}
		
		
	}
}
