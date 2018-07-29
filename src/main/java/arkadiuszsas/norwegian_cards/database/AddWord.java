package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;

public class AddWord extends DatabaseManagement{

	public AddWord(String norwegian, String norexample, String english, String engexample, String category, String imagePath) throws SQLException {
		super();
		
		String sql = "INSERT INTO " + category + " (norwegian, english, category, norExample, engExample, imagePath)" + "VALUES ('"
				+ norwegian + "','" + english + "','" + category + "','" + norexample + "','" + engexample + "','" + imagePath + "')";
						
		myStmt.executeUpdate(sql);
		System.out.println("Inserted records into the table " + category);
	}

}
