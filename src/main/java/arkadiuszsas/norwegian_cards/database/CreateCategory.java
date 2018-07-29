package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;

public class CreateCategory extends DatabaseManagement{
	
	//To add word category type: DatabaseManagement controller = new CreateCategory("table name");
	
	public CreateCategory(String tableName) throws SQLException {
		super();
		createTable(tableName);
	}

	private void createTable(String tableName) throws SQLException {
		System.out.println("Creating table...");
		
		String sql = "CREATE TABLE " + tableName + " " +
	                "(id INT NOT NULL AUTO_INCREMENT, " +
	                "NORWEGIAN VARCHAR(255) NOT NULL, " + 
	                "ENGLISH VARCHAR(255) NOT NULL, " +
	                "CATEGORY VARCHAR(255) NOT NULL, " +
	                "NOREXAMPLE VARCHAR(255) NOT NULL, " +
	                "ENGEXAMPLE VARCHAR(255) NOT NULL, " +
	                "IMAGEPATH VARCHAR(255) NOT NULL, " +
	                "PRIMARY KEY ( id ))"; 
		
		myStmt.executeUpdate(sql);
		System.out.println("Created table in given database...");
	}
}