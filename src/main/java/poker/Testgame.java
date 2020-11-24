/**
 * 
 */
package poker;

import java.util.ArrayList;

/**
 * @author the_m
 *
 */
public class Testgame {

	/**
	 * @param args
	 */

	private static ArrayList<String> gutLine(int i) {
		LineReader lr = new LineReader();
		return lr.retrieveData();

	}

	public static void main(String[] args) {

		ArrayList<String> linesfile = gutLine(0);
		final int mid = linesfile.get(0).length() / 2; // get the middle of the String
		String part1 = linesfile.get(0).substring(0, mid);
		String part2 = linesfile.get(0).substring(mid, linesfile.get(0).length()).trim();// AC JS QC AS 3D
		String[] cards1 = part1.split(" "); // 8C TS KC 9H 4S
		String[] cards2 = part2.split(" "); // 7D 2S 5D 3S AC

		CardsOfPlayers player1 = new CardsOfPlayers(cards1);
		CardsOfPlayers player2 = new CardsOfPlayers(cards2);

		System.out.println(player1.toString());
		System.out.println(player2.toString());

		HandComparator hc = new HandComparator();
		hc.tester(player1, player2);

		

		System.out.println(player1.toString());

		// System.out.println(player1.getCards());

		// player1.setCards(cards);
		// CardsOfPlayers player2;

		// Arrays.sort(player1);

		// int i = 0;
		// CardsOfPlayers cp = new CardsOfPlayers(0);
		// System.out.println(cp.toString());
		// LineReader lr = new LineReader();

		// HandComparator hc = new HandComparator();
		// System.out.println( parts[0].length() < 2 ? str : str.substring(0, 2));

	}

}
