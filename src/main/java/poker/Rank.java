package poker;

public final class Rank {
	public static final char TWO = '2';
	public static final char THREE = '3';
	public static final char FOUR = '4';
	public static final char FIVE = '5';
	public static final char SIX = '6';
	public static final char SEVEN = '7';
	public static final char EIGHT = '8';
	public static final char NINE = '9';
	public static final char TEN = 'T';
	public static final char JACK = 'J';
	public static final char QUEEN = 'Q';
	public static final char KING = 'K';
	public static final char ACE = 'A';

	private char val;

	public Rank(char val) {
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
