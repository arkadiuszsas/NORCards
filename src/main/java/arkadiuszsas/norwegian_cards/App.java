package arkadiuszsas.norwegian_cards;

import java.sql.SQLException;

import arkadiuszsas.norwegian_cards.database.*;
import arkadiuszsas.norwegian_cards.display.*;

public class App 
{
	//to run application type: mvn exec:java in cmd

	public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        
        //display main frame
        new MainFrame("NORCard");
        
        //DO NOT FORGET TO CLOSE CONNECTION!
        new CloseConnection();  
    }
}
