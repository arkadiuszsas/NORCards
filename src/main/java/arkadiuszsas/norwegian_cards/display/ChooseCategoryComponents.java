package arkadiuszsas.norwegian_cards.display;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;

import arkadiuszsas.norwegian_cards.database.GetWord;

public class ChooseCategoryComponents {
	
	private JLabel categoryLabel;
	private JButton fruitsButton;
	private JComboBox categoryList;
	private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	public JLabel createCategoryLabel() {
		categoryLabel = new JLabel("Choose category");
		categoryLabel.setSize(150, 25);
		categoryLabel.setLocation(20, 50);		
		categoryLabel.setBorder(raisedbevel);
		categoryLabel.setOpaque(true);
		categoryLabel.setForeground(Color.WHITE);
		categoryLabel.setBackground(Color.BLACK);
		categoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		categoryLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		return categoryLabel;
	}
	
	public JComboBox createCategoryList(final JLabel norwegianWordLabel, final JLabel englishWordLabel, final JLabel norExampleLabel, final JLabel engExampleLabel, final JLabel imagePath) {
		String[] categoryStrings = {"Fruits", "Vegetables"};

		categoryList = new JComboBox(categoryStrings);
		categoryList.setSize(150, 25);
		categoryList.setLocation(20, 80);
		
		categoryList.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					try {
						categoryList = (JComboBox)e.getSource();
						String categoryName = (String)categoryList.getSelectedItem();
						
						GetWord controller = new GetWord();

						WordsLabels label = new WordsLabels();
						int id = controller.getID(categoryName);
						norwegianWordLabel.setText(" Norwegian: " + controller.getNorwegianWord(categoryName, id));
						englishWordLabel.setText(" English: " + controller.getEnglishWord(categoryName, id));
						norExampleLabel.setText(" Norwegian example: " + controller.getNorwegianExample(categoryName, id));
						engExampleLabel.setText(" English example: " + controller.getEnglishExample(categoryName, id));
						
						imagePath.setIcon(new ImageIcon(controller.getImagePath(categoryName, id)));
					} 
					
					catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    }
		});
		
		return categoryList;
	}
		
	public JButton createFruitsButton() {
		fruitsButton = new JButton();
		fruitsButton.setSize(150, 25);
		fruitsButton.setLocation(20, 110);
	
		return fruitsButton;
	}
}
