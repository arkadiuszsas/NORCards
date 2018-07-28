package arkadiuszsas.norwegian_cards.database;

import java.sql.SQLException;

public class CloseConnection extends DatabaseManagement {

	public CloseConnection() throws SQLException {
		super();
		
		if (myRs != null) {
			myRs.close();
		}
		
		if (myStmt != null) {
			myStmt.close();
		}
		
		if (myConn != null) {
			myConn.close();
		}
		
		System.out.println("Disconnected");
	}
}
