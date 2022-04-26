/**
 * Question1Controller is a Java class that will handle 
 * all the interactions on the Question1 scene.
 * This scene serves as the first menu to gather user input.
 * 
 * @author The FIRE Benders
 * UTSA CS 3443.003 - Group Project
 * Spring 2022
 */

package application.controller;

import application.model.GraphModel;
import java.io.*;
import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Question1Controller implements Initializable
{

    @FXML
    private AnchorPane question1Menu;
    
    @FXML
    private TextField ageInput;

    @FXML
    private Label ageLabel;
    
    @FXML
    private TextField spendingInput;

    @FXML
    private Label spendingLabel;
    
    // class object
	private GraphModel model = new GraphModel();
	
	/**
	 * initialize() will render the Question1 View
	 * 
	 * @param arg0, URL object
	 * @param arg1, ResourceBundle object
	 * @return nothing, void
	 */
	@Override
	public void initialize( URL arg0, ResourceBundle arg1 )
	{
		ageLabel.setText( "" );
		spendingLabel.setText( "" );
	}
	
    /**
	 * clickBack() switch to the Main scene after clicking the button from the
	 * Question1 scene
	 * 
	 * @param event, ActionEvent object that activates after a button click
	 * @return nothing, void
	 * @throws IOException
	 */
	@FXML
	public void clickBack(ActionEvent event) throws IOException
	{
		URL url = new File( "src/application/view/Main.fxml" ).toURI().toURL();
		question1Menu = FXMLLoader.load( url );
		Scene scene = new Scene( question1Menu );
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene( scene );
		window.show();
	}
	
    /**
	 * clickNext() switch to the Question2 scene after clicking the button from the
	 * Question1 scene and will also collect and verify the input
	 * 
	 * @param event, ActionEvent object that activates after a button click
	 * @return nothing, void
	 * @throws IOException
	 */
	@FXML
	public void clickNext(ActionEvent event) throws IOException
	{
		try
		{
			ageLabel.setText( "" );
			ageLabel.setStyle( "-fx-text-fill: black;" );
			model.setAge( ageInput.getText().trim() );
			
			model.setError( false );
		}
		catch( NoSuchElementException e )
		{
			model.setError( true );
			ageLabel.setText( "ERROR: input cannot be negative" );
			ageLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( NumberFormatException e )
		{
			model.setError( true );
			ageLabel.setText( "ERROR: input is not a valid integer" );
			ageLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			model.setError( true );
			ageLabel.setText( "ERROR: blank input, please enter a valid integer" );
			ageLabel.setStyle( "-fx-text-fill: red;" );
		}

		try
		{
			spendingLabel.setText( "" );
			spendingLabel.setStyle( "-fx-text-fill: black;" );
			model.setSpending( spendingInput.getText().trim() );
			
			// no error detected beforehand
			if( model.isError() == false )
			{
				model.setError( false );
			}
		}
		catch( NoSuchElementException e )
		{
			model.setError( true );
			spendingLabel.setText( "ERROR: input cannot be negative" );
			spendingLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( NumberFormatException e )
		{
			model.setError( true );
			spendingLabel.setText( "ERROR: input is not a valid integer" );
			spendingLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			model.setError( true );
			spendingLabel.setText( "ERROR: blank input, please enter a valid integer" );
			spendingLabel.setStyle( "-fx-text-fill: red;" );
		}
		
		// don't go to next scene until error is fixed
		if( model.isError() == false )
		{
			URL url = new File( "src/application/view/Question2.fxml" ).toURI().toURL();
			question1Menu = FXMLLoader.load( url );
			Scene scene = new Scene( question1Menu );
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene( scene );
			window.show();
		}
	}
}