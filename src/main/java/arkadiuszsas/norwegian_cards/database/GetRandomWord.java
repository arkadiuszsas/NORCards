package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;
import java.util.Random;

public class GetRandomWord extends DatabaseManagement {

	private String norwegian, english, norexample, engexample, category, imagepath;
	
	public GetRandomWord() throws SQLException {
		super();
	}

	public int getMaxID() throws SQLException {
		
		int maxID = 0;
		myRs = myStmt.executeQuery("SELECT ID FROM FRUITS");
		
		while (myRs.next()) {
			maxID++;
		}
		
		return maxID;
	}
	
	public String getNorwegianWord(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT NORWEGIAN FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			norwegian = myRs.getString("NORWEGIAN");
		}
		
		return norwegian;
	}
	
	public String getEnglishWord(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT ENGLISH FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			english = myRs.getString("ENGLISH");
		}
		
		return english;
	}
	
	public String getNorwegianExample(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT NOREXAMPLE FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			norexample = myRs.getString("NOREXAMPLE");
		}
		
		return norexample;
	}
	
	public String getEnglishExample(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT ENGEXAMPLE FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			engexample = myRs.getString("ENGEXAMPLE");
		}
		
		return engexample;
	}
	
	public String getCategory(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT CATEGORY FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			category = myRs.getString("CATEGORY");
		}
		
		return category;
	}
	
	public String getImagePath(int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT IMAGEPATH FROM FRUITS WHERE ID=" + randomID);
		
		while (myRs.next()) {
			imagepath = myRs.getString("IMAGEPATH");
		}
		
		return imagepath;
	}
	
}