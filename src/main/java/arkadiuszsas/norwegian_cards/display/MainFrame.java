package arkadiuszsas.norwegian_cards.display;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.*;

public class MainFrame {

	//to display main frame type new MainFrame("frame name");
	
	private JFrame frame;
	private JPanel pane = new JPanel();
	
	public MainFrame() throws IOException {
		frame = new JFrame("NORCard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame settings
		frame.setSize(800, 800);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(255,255,255));
		
		//set icon
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/resources/appIcon.png"));
		
		initComponents();
		
		//set frame visibable at the end!
		frame.setVisible(true);
	}
	
	public void initComponents() throws IOException {
		WordsLabels label = new WordsLabels();
		frame.add(label.createNorwegianWordLabel());
		frame.add(label.createEnglishWordLabel());
		frame.add(label.createNorwegianExampleLabel());
		frame.add(label.createEnglishExampleLabel());
		frame.add(label.createImagePathLabel());
		
		RandomWordButton randomwordbutton = new RandomWordButton();
		frame.add(randomwordbutton.createRandomWordButton(label.getNorwegianWordLabel(), label.getEnglishWordLabel(), label.getNorwegianExampleLabel(), label.getEnglishExampleLabel(), label.getImagePathLabel()));
		
		AddWordComponents addWord = new AddWordComponents();
		frame.add(addWord.createAddWordButton());
		frame.add(addWord.createAddWordLabel());
		frame.add(addWord.createUserInputNorwegian());
		frame.add(addWord.createUserInputNorwegianExample());
		frame.add(addWord.createUserInputEnglish());
		frame.add(addWord.createUserInputEnglishExample());
		frame.add(addWord.createUserInputCategory());
		frame.add(addWord.createUserInputImagePath());
	}
}
