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
        
        //uncomment if you want to add new category
        //new CreateCategory("CATEGORY NAME");
        
        //uncomment if you want to delete category
        //new DropCategory("CATEGORY NAME");
        
        //display main frame
        new MainFrame();
        
        //DO NOT FORGET TO CLOSE CONNECTION!
        new CloseConnection();  
    }
}
