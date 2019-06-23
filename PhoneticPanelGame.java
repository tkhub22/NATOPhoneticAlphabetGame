import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.TreeMap;

import javax.swing.*;
import javax.swing.border.Border;

public class PhoneticPanelGame extends JPanel {
	private JLabel label, score, letter;
	private JButton submitNext;
	private JPanel top, center, bottom;
	private JTextArea answer;
	public TreeMap<String, String> t;
	public int sco;

	public PhoneticPanelGame() {
		t = new TreeMap<String, String>();
		t.put("A", "Alpha");
		t.put("B", "Bravo");
		t.put("C", "Charlie");
		t.put("D", "Delta");
		t.put("E", "Echo");
		t.put("F", "Foxtrot");
		t.put("G", "Golf");
		t.put("H", "Hotel");
		t.put("I", "India");
		t.put("J", "Juliett");
		t.put("K", "Kilo");
		t.put("L", "Lima");
		t.put("M", "Mike");
		t.put("N", "November");
		t.put("O", "Oscar");
		t.put("P", "Papa");
		t.put("Q", "Quebec");
		t.put("R", "Romeo");
		t.put("S", "Sierra");
		t.put("T", "Tango");
		t.put("U", "Uniform");
		t.put("V", "Victor");
		t.put("W", "Whiskey");
		t.put("X", "X-ray");
		t.put("Y", "Yankee");
		t.put("Z", "Zulu");

		setLayout(new BorderLayout(80, 80)); // layout

		// top panel
		top = new JPanel();
		top.setBackground(new Color(77, 148, 255));
		// top.setPreferredSize(new Dimension(40, 100));
		add(top, BorderLayout.NORTH);

		// label
		label = new JLabel("NATO Phonetic Alphabet Game");
		// label.setVerticalAlignment(JLabel.CENTER);
		// label.setHorizontalAlignment(JLabel.CENTER);
		/*
		 * Border border = BorderFactory.createLineBorder(Color.BLACK);
		 * label.setBorder(border);
		 */
		Font f = new Font("TimesRoman", Font.BOLD, 25);
		label.setFont(f);
		label.setForeground(new Color(115, 115, 115));
		top.add(label);

		// FIGURE OUT HOW TO CENTER LABELLLLLLLLLL!!!!

		// center
		center = new JPanel();
		add(center, BorderLayout.CENTER);
		// center.setPreferredSize(new Dimension(100, 100));//40,100

		center.setBackground(new Color(255, 128, 128));

		// button panel
		bottom = new JPanel();
		add(bottom, BorderLayout.SOUTH);
		bottom.setBackground(new Color(255, 251, 152));
		// fix this

		// letter
		letter = new JLabel("Letter: A   "); // 3 spaces
		Font f2 = new Font("TimesRoman", Font.BOLD, 30);
		letter.setFont(f2);
		letter.setForeground(new Color(0, 0, 0));
		center.add(letter);

		// answer textbox
		Font answerFont = new Font("TimesRoman", Font.BOLD, 40);
		answer = new JTextArea(1, 5);
		answer.setFont(answerFont);
		center.add(answer);

		// score
		sco = 0;
		score = new JLabel("   Score: 0 "); // 3 spaces
		Font f1 = new Font("TimesRoman", Font.BOLD, 30);
		score.setFont(f1);
		score.setForeground(new Color(26, 26, 26));
		center.add(score);

		// submit/next button
		submitNext = new JButton("Submit/Next");
		submitNext.addActionListener(new SubmitNextButton());
		center.add(submitNext);

	}

	

	private class SubmitNextButton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = answer.getText();
			String l = letter.getText().substring(8, 9);

			if (t.get(l).equals(a)) {
				sco++;
				score.setText("    Score: " + sco);

				// reset stuff
				letter.setText("Letter: " + randomLetter() + "   ");
				answer.setText("");
			}

			else {
				sco = 0;
				score.setText("    Score: " + sco);
				System.out.println("Wrong! Start over :(");
				letter.setText("Letter: " + randomLetter() + "   ");
				answer.setText("");
			}

		}
		
		//fix the enter thing
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				System.out.println("Hello");
				//actionPerformed();
			}

		}

		public String randomLetter() {
			Random rnd = new Random();
			char c = (char) (rnd.nextInt(26) + 'a');
			String randoLetter = "" + c;
			randoLetter = randoLetter.toUpperCase();
			return randoLetter;
		}
	}
}
