/**
 * Question2Controller is a Java class that will handle 
 * all the interactions on the Question2 scene.
 * This scene serves as the second menu to gather user input.
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

public class Question2Controller implements Initializable
{

    @FXML
    private AnchorPane question2Menu;
    
    @FXML
    private TextField savingsInput;

    @FXML
    private Label savingsLabel;
    
    @FXML
    private TextField contributionsInput;

    @FXML
    private Label contributionsLabel;
    
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
		savingsLabel.setText( "" );
		contributionsLabel.setText( "" );
	}
	
    /**
	 * clickBack() switch to the Question1 scene after clicking the button from the
	 * Question2 scene
	 * 
	 * @param event, ActionEvent object that activates after a button click
	 * @return nothing, void
	 * @throws IOException
	 */
	@FXML
	public void clickBack(ActionEvent event) throws IOException
	{
		URL url = new File( "src/application/view/Question1.fxml" ).toURI().toURL();
		question2Menu = FXMLLoader.load( url );
		Scene scene = new Scene( question2Menu );
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene( scene );
		window.show();
	}
	
    /**
	 * clickNext() switch to the Graph scene after clicking the button from the
	 * Question2 scene and will also collect and verify the input
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
			savingsLabel.setText( "" );
			savingsLabel.setStyle( "-fx-text-fill: black;" );
			model.setSavings( savingsInput.getText().trim() );
			
			model.setError( false );
		}
		catch( NoSuchElementException e )
		{
			model.setError( true );
			savingsLabel.setText( "ERROR: input cannot be negative" );
			savingsLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( NumberFormatException e )
		{
			model.setError( true );
			savingsLabel.setText( "ERROR: input is not a valid integer" );
			savingsLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			model.setError( true );
			savingsLabel.setText( "ERROR: blank input, please enter a valid integer" );
			savingsLabel.setStyle( "-fx-text-fill: red;" );
		}
		
		try
		{
			contributionsLabel.setText( "" );
			contributionsLabel.setStyle( "-fx-text-fill: black;" );
			model.setContributions( contributionsInput.getText().trim() );
			
			// no error detected beforehand
			if( model.isError() == false )
			{
				model.setError( false );
			}
		}
		catch( NoSuchElementException e )
		{
			model.setError( true );
			contributionsLabel.setText( "ERROR: input cannot be negative" );
			contributionsLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( NumberFormatException e )
		{
			model.setError( true );
			contributionsLabel.setText( "ERROR: input is not a valid integer" );
			contributionsLabel.setStyle( "-fx-text-fill: red;" );
		}
		catch( StringIndexOutOfBoundsException e )
		{
			model.setError( true );
			contributionsLabel.setText( "ERROR: blank input, please enter a valid integer" );
			contributionsLabel.setStyle( "-fx-text-fill: red;" );
		}
		
		// don't go to next scene until error is fixed
		if( model.isError() == false )
		{
			URL url = new File( "src/application/view/Graph.fxml" ).toURI().toURL();
			question2Menu = FXMLLoader.load( url );
			Scene scene = new Scene( question2Menu );
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene( scene );
			window.show();
		}
	}
}