package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;
import java.util.Random;

public class GetRandomWord extends DatabaseManagement {

	public int maxID;
	public String randomCategory;
	private String norwegian, english, norexample, engexample, category, imagepath;
	
	public GetRandomWord() throws SQLException {
		super();
	}

	public void getCategoryAndItsMaxID() throws SQLException {
		
		myRs = myStmt.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES "
				+ "WHERE TABLE_SCHEMA='NORCARDS' ORDER BY RAND() LIMIT 1");
		
		while (myRs.next()) {
			this.randomCategory = myRs.getString("TABLE_NAME");
		}
		System.out.println(this.randomCategory);
		
		int maxID = 0;
		myRs = myStmt.executeQuery("SELECT ID FROM " + this.randomCategory);
		
		while (myRs.next()) {
			this.maxID++;
		}
		
	}
		
	public String getNorwegianWord(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".NORWEGIAN FROM " + category
				+ " WHERE ID=" + randomID);

		while (myRs.next()) {
			norwegian = myRs.getString("NORWEGIAN");
		}
		
		return norwegian;
	}
	
	public String getEnglishWord(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".ENGLISH FROM " + category
				+ " WHERE ID=" + randomID);
		
		while (myRs.next()) {
			english = myRs.getString("ENGLISH");
		}
		
		return english;
	}
	
	public String getNorwegianExample(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".NOREXAMPLE FROM " + category
				+ " WHERE ID=" + randomID);
		
		while (myRs.next()) {
			norexample = myRs.getString("NOREXAMPLE");
		}
		
		return norexample;
	}
	
	public String getEnglishExample(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".ENGEXAMPLE FROM " + category
				+ " WHERE ID=" + randomID);
		
		while (myRs.next()) {
			engexample = myRs.getString("ENGEXAMPLE");
		}
		
		return engexample;
	}
	
	public String getCategory(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".CATEGORY FROM " + category
				+ " WHERE ID=" + randomID);
		
		while (myRs.next()) {
			category = myRs.getString("CATEGORY");
		}
		
		return category;
	}
	
	public String getImagePath(String category, int randomID) throws SQLException {
		myRs = myStmt.executeQuery("SELECT " + category + ".IMAGEPATH FROM " + category
				+ " WHERE ID=" + randomID);
		
		while (myRs.next()) {
			imagepath = myRs.getString("IMAGEPATH");
		}
		
		return imagepath;
	}
	
}