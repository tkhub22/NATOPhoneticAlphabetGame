import java.awt.*;
import java.util.*;
import javax.swing.*;

public class NatoPhoneticAlphabet extends JFrame{
	public static void main (String [] args){
		System.out.println("sup");
		JFrame frame = new JFrame("NATO Phonetic Alphabet Game");
	      frame.setSize(525,400);
	      frame.setLocation(400,200);
	      frame.getContentPane().setBackground(new Color(255, 128, 128));
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setResizable(false);
	      frame.setContentPane(new PhoneticPanelGame());
	      frame.setVisible(true);
	}
}

/*
What next:

1. fix aesthetic look
2. make the enter button in the text area click the submit button
*/