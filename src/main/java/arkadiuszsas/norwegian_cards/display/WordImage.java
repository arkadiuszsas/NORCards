package arkadiuszsas.norwegian_cards.display;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class WordImage {
	
	private JLabel imageLabel = new JLabel();
	
	public JLabel addWordImage(String path) throws IOException {	
		imageLabel.setIcon(new ImageIcon(path));
		imageLabel.setSize(350, 200);
		imageLabel.setLocation(320, 140);
		
		return imageLabel;
	}
}
