package poker;

import java.util.Arrays;

public class HandComparator {

	public HandComparator() {

	}

	// Returns 1 if player 1 wins, returns 2 if player2 wins, and returns 0 if
	// there's a tie/draw.
	public int tester(CardsOfPlayers p1, CardsOfPlayers p2) {

		// RoyalFlush
		Hand h1 = new Hand(p1);
		Hand h2 = new Hand(p2);
		Card[] cards = h1.hand;
		Arrays.sort(cards);

		System.out.println(cards.toString());

		if (h1.royalFlush() || h2.royalFlush()) {
			if (!h1.royalFlush()) {
				return 2;
			} else if (!h2.royalFlush()) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;

	}

}
