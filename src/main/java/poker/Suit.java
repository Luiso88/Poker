package poker;

public final class Suit {
	public static final char SPADES = 'S';
	public static final char DIAMONDS = 'D';
	public static final char CLUBS = 'C';
	public static final char HEARTS = 'H';

	private char val;

	public Suit(char val) {
		this.val = val;
	}

	public char getVal() {
		return val;
	}

	public void setVal(char val) {
		this.val = val;
	}

	@Override
	public String toString() {
		// char to String using toString() method
		String str = Character.toString(this.val);
		return str;
	}

}
