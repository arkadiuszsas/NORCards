package arkadiuszsas.norwegian_cards.display;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class WordsLabels {

	private JLabel norwegianWordLabel, englishWordLabel, norExampleLabel, engExampleLabel, imagePath;
	private Border blackline = BorderFactory.createLoweredBevelBorder();
	
	//label to display norwegian word
	public JLabel createNorwegianWordLabel() {
		norwegianWordLabel = new JLabel(" Norwegian: ");
		norwegianWordLabel.setSize(550,25);
		norwegianWordLabel.setLocation(220, 20);
		norwegianWordLabel.setVisible(true);
		norwegianWordLabel.setBorder(blackline);
		norwegianWordLabel.setOpaque(true);
		norwegianWordLabel.setForeground(Color.BLACK);
		norwegianWordLabel.setBackground(new Color(255,160,122));
		return norwegianWordLabel;
	}
	
	//label to display norwegian example
	public JLabel createNorwegianExampleLabel() {
		norExampleLabel = new JLabel(" Norwegian example: ");
		norExampleLabel.setVisible(true);
		norExampleLabel.setSize(550,25);
		norExampleLabel.setLocation(220,50);
		norExampleLabel.setBorder(blackline);
		norExampleLabel.setOpaque(true);
		norExampleLabel.setForeground(Color.BLACK);
		norExampleLabel.setBackground(new Color(255,160,122));
		return norExampleLabel;
	}
	
	//label to display english word
	public JLabel createEnglishWordLabel() {
		englishWordLabel = new JLabel(" English: ");
		englishWordLabel.setVisible(true);
		englishWordLabel.setSize(550,25);
		englishWordLabel.setLocation(220,80);
		englishWordLabel.setBorder(blackline);
		englishWordLabel.setOpaque(true);
		englishWordLabel.setForeground(Color.BLACK);
		englishWordLabel.setBackground(new Color(175,238,238));
		return englishWordLabel;
	}
	
	//label to display english example
	public JLabel createEnglishExampleLabel() {
		engExampleLabel = new JLabel(" English example: ");
		engExampleLabel.setVisible(true);
		engExampleLabel.setSize(550,25);
		engExampleLabel.setLocation(220,110);
		engExampleLabel.setBorder(blackline);
		engExampleLabel.setOpaque(true);
		engExampleLabel.setForeground(Color.BLACK);
		engExampleLabel.setBackground(new Color(175,238,238));
		return engExampleLabel;
	}
	
	public JLabel createImagePathLabel() {
		imagePath = new JLabel("");
		imagePath.setSize(350, 200);
		imagePath.setLocation(320, 140);
		return imagePath;
	}
		
	public JLabel getNorwegianWordLabel() {
		return norwegianWordLabel;
	}
	
	public JLabel getNorwegianExampleLabel() {
		return norExampleLabel;
	}
	
	public JLabel getEnglishWordLabel() {
		return englishWordLabel;
	}
	
	public JLabel getEnglishExampleLabel() {
		return engExampleLabel;
	}
	
	public JLabel getImagePathLabel() {
		return imagePath;
	}
	
}