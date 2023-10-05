package warTheGame;

public class Card {
	private String name;
	private String suit;
	private int value;

	public Card(String card, String suit, int value) {
		this.name = card;
		this.suit = suit;
		this.value = value;
	}
		
	//Getters and Setters ************************************************Getters and Setters***********************************************
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	//Method storage area **************************************************** Method Storage Area***********************************************
	public void describe() {
		System.out.println("Name: " + this.name + "\nSuit: " + this.suit + "\nValue: " + this.value+ "\n");
	}

	public static boolean isEqual(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}
