package poker;

import java.util.Arrays;

public class CardsOfPlayers {

	Card[] numCards = new Card[5];;
	// ArrayList<String> cards = null;

	public CardsOfPlayers(String[] strings) { /// ------

		numCards[0] = new Card(strings[0]);
		numCards[1] = new Card(strings[1]);
		numCards[2] = new Card(strings[2]);
		numCards[3] = new Card(strings[3]);
		numCards[4] = new Card(strings[4]);
		Arrays.parallelSort(numCards);

	}
	


	/*
	 * public String[] increaseArray(String[] theArray) { int i = theArray.length;
	 * int n = ++i; String[] newArray = new String[n]; for (int cnt = 0; cnt <
	 * theArray.length; cnt++) { newArray[cnt] = theArray[cnt]; } return newArray; }
	 */

	public Card[] getCards() {
		return numCards;
	}

	public String toString() {// overriding the toString() method
		return numCards[0] + "" + numCards[1] + "" + numCards[2] + "" + numCards[3] + "" + numCards[4] + "";
	}

}
