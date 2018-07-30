package arkadiuszsas.norwegian_cards.display;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import arkadiuszsas.norwegian_cards.database.GetRandomWord;

public class RandomWordButton {

	private JButton randomButton;
	private int maxID = 0;
	
	public JButton createRandomWordButton(final JLabel norwegianWordLabel, final JLabel englishWordLabel, final JLabel norExampleLabel, final JLabel engExampleLabel, final JLabel imagePath) {
		randomButton = new JButton("Random word");
	    randomButton.setVisible(true);
	    randomButton.setSize(150,25);
	    randomButton.setLocation(20,20);
	    
	    randomButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					//get max word ID
					GetRandomWord controller = new GetRandomWord();
					controller.getCategoryAndItsMaxID();
					
					//get random word ID
					Random random = new Random();
					int randomID = random.nextInt(controller.maxID) + 1;
									
					norwegianWordLabel.setText(" Norwegian: " + controller.getNorwegianWord(controller.randomCategory, randomID));
					englishWordLabel.setText(" English: " + controller.getEnglishWord(controller.randomCategory, randomID));
					norExampleLabel.setText(" Norwegian example: " + controller.getNorwegianExample(controller.randomCategory, randomID));
					engExampleLabel.setText(" English example: " + controller.getEnglishExample(controller.randomCategory, randomID));
					
					imagePath.setIcon(new ImageIcon(controller.getImagePath(controller.randomCategory, randomID)));
				} 
				
				catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
	    });
	    
	    return randomButton;
	}
}