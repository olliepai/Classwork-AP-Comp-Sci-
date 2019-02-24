package deckOfCards;

public class Card {
	
	//0 is clubs, 1 is diamonds, 2 is hearts, 3 is spades
	private int suit; 
	
	//1 is an Ace, 11 is a Jack, 12 is Queen, 13 is King
	private int rank;
	
	private static final String[] ALL_SUITS = {"clubs", "diamonds", "hearts", "spades"};
	private static final String[] ALL_RANKS = {"better not happen", "Ace", "2", "3", "4", "5",
			"6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}
	
	public String toString() {
		return ALL_RANKS[rank] + " of " + ALL_SUITS[suit];
	}
}
