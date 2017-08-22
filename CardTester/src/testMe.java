import java.awt.CardLayout;

import javax.swing.JPanel;


public class testMe {
	JPanel cards;
	final static String BUTTONPANEL = "Card with JButtons";
	final static String TEXTPANEL = "Card with JTextField";

	public testMe(){
	//Where the components controlled by the CardLayout are initialized:
	//Create the "cards".
	JPanel card1 = new JPanel();
	JPanel card2 = new JPanel();

	//Create the panel that contains the "cards".
	cards = new JPanel(new CardLayout());
	cards.add(card1, "BUTTONPANEL");
	cards.add(card2, "TEXTPANEL");
	
	}

	
	public static void main(String[] args) {
		
		
	}

}