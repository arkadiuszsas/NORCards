package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;

public class DropCategory extends DatabaseManagement {

	//To drop word category type: DatabaseManagement controller = new DropCategory("table name");
	
	public DropCategory(String tableName) throws SQLException {
		super();
		dropTable(tableName);
	}
	
	private void dropTable(String tableName) throws SQLException {
		System.out.println("Dropping table...");
		
		String sql = "DROP TABLE IF EXISTS " + tableName;
		
		myStmt.executeUpdate(sql);
		System.out.println("Dropped table in given database...");
	}
}
