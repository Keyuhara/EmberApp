/**
 * Main is a Java class containing a main method 
 * that will first run the application.
 * 
 * @author The FIRE Benders
 * UTSA CS 3443.003 - Group Project
 * Spring 2022
 */

package application;
	
import java.io.*;
import java.net.*;
import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Main extends Application
{
	public static void main( String[] args )
	{
		launch( args );
	}
	
	@Override
	public void start( Stage primaryStage )
	{
		try
		{
			primaryStage.setTitle( "Ember" );
			URL url = new File( "src/application/view/Main.fxml" ).toURI().toURL();
			AnchorPane root = FXMLLoader.load( url );
			Scene scene = new Scene( root, 480, 720 );
			primaryStage.setScene( scene );
			primaryStage.show();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}