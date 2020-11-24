package poker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LineReader {
	String data = null;

	public LineReader() {

	}

	public ArrayList<String> retrieveData() {
		ArrayList<String> cards = new ArrayList<String>();
		String line;
		try {
			BufferedReader input = new BufferedReader(new FileReader("pokerdata.txt"));
			if (input.ready()) {

				while ((line = input.readLine()) != null) {
					cards.add(new String(line));
				}
				input.close();
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return cards;
	}

}
