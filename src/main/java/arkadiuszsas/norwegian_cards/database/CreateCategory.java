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
	                "norwegian VARCHAR(255) NOT NULL, " + 
	                "english VARCHAR(255) NOT NULL, " +
	                "category VARCHAR(255) NOT NULL, " +
	                "norExample VARCHAR(255) NOT NULL, " +
	                "engExample VARCHAR(255) NOT NULL, " +
	                "PRIMARY KEY ( id ))"; 
		
		myStmt.executeUpdate(sql);
		System.out.println("Created table in given database...");
	}
}