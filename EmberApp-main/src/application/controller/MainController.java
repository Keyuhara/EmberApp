/**
 * MainController is a Java class that will handle 
 * all the interactions on the Main scene.
 * This scene serves as the main menu.
 * 
 * @author The FIRE Benders
 * UTSA CS 3443.003 - Group Project
 * Spring 2022
 */

package application.controller;

import java.io.*;
import java.net.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class MainController
{

    @FXML
    private AnchorPane mainMenu;

    @FXML
    private Button start;
    
    /**
	 * clickNext() switch to the Question1 scene after clicking the button from the
	 * Main scene
	 * 
	 * @param event, ActionEvent object that activates after a button click
	 * @return nothing, void
	 * @throws IOException
	 */
	@FXML
	public void clickNext(ActionEvent event) throws IOException
	{
		URL url = new File( "src/application/view/Question1.fxml" ).toURI().toURL();
		mainMenu = FXMLLoader.load( url );
		Scene scene = new Scene( mainMenu );
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene( scene );
		window.show();
	}
}