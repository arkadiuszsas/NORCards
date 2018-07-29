package arkadiuszsas.norwegian_cards.display;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import arkadiuszsas.norwegian_cards.database.AddWord;

public class AddWordComponents {

	private JButton addWordButton;
	private JLabel addWordLabel;
	private JTextField userInputNorwegian, userInputEnglish, userInputcategory, userInputNorExample, userInputEngExample, userInputImagePath;
	private String userNorwegianWord = "", userEnglishWord = "", userCategoryWord = "", userNorwegianExamp = "", userEnglishExamp = "", userImagePath = "";
	private Border blackline = BorderFactory.createLoweredBevelBorder();
	private Border raisedbevel = BorderFactory.createRaisedBevelBorder();
	
	public JButton createAddWordButton() {
		addWordButton = new JButton("Add new word");
		addWordButton.setSize(550,25);
		addWordButton.setLocation(220,560);
		
		addWordButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					submitAddingAction();
				}
				catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		return addWordButton;
	}
	
	private void submitAddingAction() throws SQLException {
		userNorwegianWord = userInputNorwegian.getText();
		userNorwegianExamp = userInputNorExample.getText();
		userEnglishWord = userInputEnglish.getText();
		userEnglishExamp = userInputEngExample.getText();
		userCategoryWord = userInputcategory.getText();
		userImagePath = userInputImagePath.getText();
		
		new AddWord(userNorwegianWord, userNorwegianExamp, userEnglishWord, userEnglishExamp, userCategoryWord, userImagePath);
	
		addWordLabel.setText("New word added to the database!");
	}
	
	public JLabel createAddWordLabel() {
		addWordLabel = new JLabel("Add new word below!");
		addWordLabel.setSize(550,25);
		addWordLabel.setLocation(220,350);
		addWordLabel.setBorder(raisedbevel);
		addWordLabel.setOpaque(true);
		addWordLabel.setForeground(Color.WHITE);
		addWordLabel.setBackground(Color.BLACK);
		addWordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		addWordLabel.setVerticalAlignment(SwingConstants.CENTER);
		
		return addWordLabel;
	}
	
	
	public JTextField createUserInputNorwegian() {
		userInputNorwegian = new JTextField(" norwegian...", 30);
		userInputNorwegian.setSize(550, 25);
		userInputNorwegian.setLocation(220, 380);
		userInputNorwegian.setBorder(blackline);
		userInputNorwegian.setOpaque(true);
		userInputNorwegian.setForeground(new Color(255,255,255));
		userInputNorwegian.setBackground(new Color(105,105,105));
		
		return userInputNorwegian;
	}
	
	public JTextField createUserInputNorwegianExample() {
		userInputNorExample = new JTextField(" norwegian example...", 30);
		userInputNorExample.setSize(550,25);
		userInputNorExample.setLocation(220, 410);
		userInputNorExample.setBorder(blackline);
		userInputNorExample.setOpaque(true);
		userInputNorExample.setForeground(new Color(255,255,255));
		userInputNorExample.setBackground(new Color(105,105,105));
		
		return userInputNorExample;
	}
	
	public JTextField createUserInputEnglish() {
		userInputEnglish = new JTextField(" english...", 30);
		userInputEnglish.setSize(550,25);
		userInputEnglish.setLocation(220, 440);
		userInputEnglish.setBorder(blackline);
		userInputEnglish.setOpaque(true);
		userInputEnglish.setForeground(new Color(255,255,255));
		userInputEnglish.setBackground(new Color(105,105,105));
		
		return userInputEnglish;
	}
	
	public JTextField createUserInputEnglishExample() {
		userInputEngExample = new JTextField(" english example...", 30);
		userInputEngExample.setSize(550,25);
		userInputEngExample.setLocation(220, 470);
		userInputEngExample.setBorder(blackline);
		userInputEngExample.setOpaque(true);
		userInputEngExample.setForeground(new Color(255,255,255));
		userInputEngExample.setBackground(new Color(105,105,105));
		
		return userInputEngExample;
	}
	
	public JTextField createUserInputCategory() {
		userInputcategory = new JTextField(" category...", 30);
		userInputcategory.setSize(550,25);
		userInputcategory.setLocation(220, 500);
		userInputcategory.setBorder(blackline);
		userInputcategory.setOpaque(true);
		userInputcategory.setForeground(new Color(255,255,255));
		userInputcategory.setBackground(new Color(105,105,105));
		
		return userInputcategory;
	}	
	
	public JTextField createUserInputImagePath() {
		userInputImagePath = new JTextField(" image path...", 30);
		userInputImagePath.setSize(550,25);
		userInputImagePath.setLocation(220, 530);
		userInputImagePath.setBorder(blackline);
		userInputImagePath.setOpaque(true);
		userInputImagePath.setForeground(new Color(255,255,255));
		userInputImagePath.setBackground(new Color(105,105,105));
		
		return userInputImagePath;
	}	
}
