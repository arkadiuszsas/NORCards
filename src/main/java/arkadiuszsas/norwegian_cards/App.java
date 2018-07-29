package arkadiuszsas.norwegian_cards;

import java.io.IOException;
import java.sql.SQLException;

import arkadiuszsas.norwegian_cards.database.*;
import arkadiuszsas.norwegian_cards.display.*;

public class App 
{
	//to run application type: mvn exec:java in cmd

	public static void main( String[] args ) throws SQLException, IOException
    {
        System.out.println( "Hello World!" );
        
        //new CreateCategory("FRUITS");
        //display main frame
        new MainFrame();
        
        //new AddWord("plomme (ei)", "Ei plomme er lilla.", "plum", "A plum is purple.", "FRUITS");
        //new GetRandomWord();
        //DO NOT FORGET TO CLOSE CONNECTION!
        new CloseConnection();  
    }
}
