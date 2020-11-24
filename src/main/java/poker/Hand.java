/**
 * 
 */
package poker;

import java.util.Arrays;

/**
 * @author the_m
 *
 */
public final class Hand {

	Card[] hand;

	public Hand(CardsOfPlayers p) {
		hand = p.getCards();

	}

	// checks for a royal flush
	public boolean royalFlush() {

		if (hand[0].getRank().getVal() == 'T' && hand[1].getRank().getVal() == 'J' && hand[2].getRank().getVal() == 'Q'
				&& hand[3].getRank().getVal() == 'K' && hand[4].getRank().getVal() == 'A') {
			return true;
		} else {
			return false;
		}
	}

	// checks for a straight flush
	public boolean straightFlush() {
		for (int counter = 1; counter < 5; counter++) {
			if (hand[0].getSuit().getVal() != hand[counter].getSuit().getVal()) {
				return false;
			}
		}
		for (int counter2 = 1; counter2 < 5; counter2++) {
			if (hand[counter2 - 1].getRank().getVal() != (hand[counter2].getRank().getVal() - 1)) {
				return false;
			}
		}
		return true;

	}

	// checks for four of a kind
	public boolean fourOfaKind() {
		if (hand[0].getRank().getVal() != hand[3].getRank().getVal()
				&& hand[1].getRank().getVal() != hand[4].getRank().getVal()) {
			return false;
		} else {
			return true;
		}
	}

	// checks for full house
	public boolean fullHouse() {
		int comparison = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (hand[counter - 1].getRank().getVal() == hand[counter].getRank().getVal()) {
				comparison++;
			}
		}
		if (comparison == 3) {
			return true;
		} else {
			return false;
		}
	}

	// checks for flush
	public boolean flush() {
		for (int counter = 1; counter < 5; counter++) {
			if (hand[0].getSuit().getVal() != hand[counter].getSuit().getVal()) {
				return false;
			}
		}
		return true;
	}

	// check for straight
	public boolean straight() {
		for (int counter2 = 1; counter2 < 5; counter2++) {
			if (hand[counter2 - 1].getRank().getVal() != (hand[counter2].getRank().getVal() - 1)) {
				return false;
			}

		}
		return true;
	}

	// checks for triple
	public boolean triple() {
		if (hand[0].getRank().getVal() == hand[2].getRank().getVal()
				|| hand[2].getRank().getVal() == hand[4].getRank().getVal()) {
			return true;
		}
		return false;
	}

	// checks for two pairs
	public boolean twoPairs() {
		int check = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (hand[counter - 1].getRank().getVal() == hand[counter].getRank().getVal()) {
				check++;
			}
		}
		if (check == 2) {
			return true;
		} else {
			return false;
		}
	}

	// check for pair
	public boolean pair() {
		int check = 0;
		for (int counter = 1; counter < 5; counter++) {
			if (hand[counter - 1].getRank().getVal() == hand[counter].getRank().getVal()) {
				check++;
			}
		}
		if (check == 1) {
			return true;
		} else {
			return false;
		}
	}

	// find highest card
	public int highCard() {
		int highCard = 0;
		for (int counter = 0; counter < 5; counter++) {
			if (hand[counter].getRank().getVal() > highCard) {
				highCard = hand[counter].getRank().getVal();
			}
		}
		return highCard;
	}

	@Override
	public String toString() {
		return Arrays.toString(hand);
	}

}
