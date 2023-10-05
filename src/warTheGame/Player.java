package warTheGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//private List<Card> hand;
	private int score;
	private String name;
	private List<Card> hand = new ArrayList<>();
	
	
	
	public Player(String name) {
		//List<Card> hand = new ArrayList<>();
		score = 0;
		this.name = name;
				
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public void describe() {
		System.out.println("Player: ");
		for (Card card : hand ) {
			card.describe();
		}
	}
	public Card flip () {
		if( hand.isEmpty() ) {
			return null;
		}
		return hand.remove(0);
	}
	
	public void playerDraw(Deck deck) {
		Card card = deck.draw();
		//List<Card> hand = new ArrayList<>();
			if(card != null){
				hand.add(card);
			}
		}
	
	public void incrementScore() {
		score++;
	}
	

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
