package arkadiuszsas.norwegian_cards.database;

import java.sql.*;

public class DatabaseManagement {

	protected static Connection myConn = null;
	protected static Statement myStmt = null;
	protected static ResultSet myRs = null;
	
	private String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	//method to create new table
	public DatabaseManagement() throws SQLException {
	
		try {
			//use driver
			Class.forName(MYSQL_DRIVER);
		    System.out.println("Class Loaded....");
			
		    //get connection to database
			myConn = DriverManager.getConnection(getDbUrl(), getUserName(), getPassword());
			//System.out.println("Connected to database...");
			
			//create a statement
			myStmt = myConn.createStatement();			
		}
					
		catch (Exception exc){
			exc.printStackTrace();
		}		
	}
		
	private static String getDbUrl() {
		return "jdbc:mysql://den1.mysql6.gear.host/norcards";
	}
	
	private static String getUserName() {
		return "norcards";
	}
	
	private static String getPassword() {
		return "Om67Iim~Kl?9";
	}
}
