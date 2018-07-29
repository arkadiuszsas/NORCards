package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;

public class GetWord extends DatabaseManagement {

	private String norwegian, english, norexample, engexample, category;
	
	public GetWord() throws SQLException {
		super();
	}
	
	public String getNorwegianWord(String category, int id) throws SQLException {
		myRs = myStmt.executeQuery("SELECT NORWEGIAN FROM " + category + "WHERE ID=" + id);
		
		while (myRs.next()) {
			norwegian = myRs.getString("NORWEGIAN");
		}
		
		return norwegian;
	}
	
	public String getEnglishWord(String category, int id) throws SQLException {
		myRs = myStmt.executeQuery("SELECT ENGLISH FROM " + category + "WHERE ID=" + id);
		
		while (myRs.next()) {
			english = myRs.getString("ENGLISH");
		}
		
		return english;
	}
	
	public String getNorwegianExample(String category, int id) throws SQLException {
		myRs = myStmt.executeQuery("SELECT NOREXAMPLE FROM " + category + "WHERE ID=" + id);
		
		while (myRs.next()) {
			norexample = myRs.getString("NOREXAMPLE");
		}
		
		return norexample;
	}
	
	public String getEnglishExample(String category, int id) throws SQLException {
		myRs = myStmt.executeQuery("SELECT ENGEXAMPLE FROM " + category + "WHERE ID=" + id);
		
		while (myRs.next()) {
			engexample = myRs.getString("ENGEXAMPLE");
		}
		
		return engexample;
	}
	
	public String getCategory(String category, int id) throws SQLException {
		myRs = myStmt.executeQuery("SELECT CATEGORY FROM " + category + "WHERE ID=" + id);
		
		while (myRs.next()) {
			category = myRs.getString("CATEGORY");
		}
		
		return category;
	}

}
