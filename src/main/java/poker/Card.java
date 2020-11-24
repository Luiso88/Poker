package poker;

public class Card implements Comparable<Card> {

	private Rank rank;
	private Suit suit;

	public static final char TEN = 'T';
	public static final char JACK = 'J';
	public static final char QUEEN = 'Q';
	public static final char KING = 'K';
	public static final char ACE = 'A';

	int ten = 10;
	int nine = 9;
	int eight = 8;
	int seven = 7;
	int six = 6;
	int five = 5;
	int four = 4;
	int three = 3;
	int two = 2;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Card(String string) {// "3S"
		rank = new Rank(string.toCharArray()[0]);
		suit = new Suit(string.toCharArray()[1]);
	}

	public Card() {
		// TODO Auto-generated constructor stub
	}

	public void setCard(String string) {
		rank = new Rank(string.toCharArray()[0]);
		suit = new Suit(string.toCharArray()[1]);
	}

	// public Card getCard() {
	// rank = new Rank(string.toCharArray()[0]);
	// suit = new Suit(string.toCharArray()[1]);
	// System.out.println(result);
	// }

	public void setCards(String[] string) {
		for (int i = 0; i < 5; i++) {
			System.out.println(string[i]);
			this.setCard(string[i]);
		}
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public int charToInt(char c) {
		int e = 0;
		if (c == '2') {
			e = 2;
		}
		if (c == '3') {
			e = 3;
		}
		if (c == '4') {
			e = 4;
		}
		if (c == '5') {
			e = 5;
		}
		if (c == '6') {
			e = 6;
		}
		if (c == '7') {
			e = 7;
		}
		if (c == '8') {
			e = 8;
		}
		if (c == '9') {
			e = 9;
		}
		if (c == 'T') {
			e = 10;
		}
		if (c == 'J') {
			e = 11;
		}
		if (c == 'Q') {
			e = 12;
		}
		if (c == 'K') {
			e = 13;
		}
		if (c == 'A') {
			e = 14;
		}

		return e;

	}

	@Override
	public int compareTo(Card o) {
		int c = charToInt(this.rank.getVal());
		int O = charToInt(o.rank.getVal());
		if (c < O) {
			return 1;
		} else if (c > 0) {
			return 0;
		} else {
			return -1;
		}

	}

	public String toString() {// overriding the toString() method
		return this.rank + "" + this.suit + " ";
	}

}
