/**
 * GraphController is a Java class that will handle 
 * all the interactions on the Graph scene.
 * This scene will display the final output.
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
import javafx.scene.chart.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class GraphController implements Initializable
{
    @FXML
    private AnchorPane graphMenu;

    @FXML
    private Text firstText;

    @FXML
    private Text timeText;

    @FXML
    private Text goalText;
    
    @FXML
    private LineChart<String, Integer> chart;
    
    // class object
	private GraphModel model = new GraphModel();

	/**
	 * initialize() render the Graph view by processing 
	 * the Map Collection data from the Graph model
	 * 
	 * @param arg0, URL object
	 * @param arg1, ResourceBundle object
	 * @return nothing, void
	 */
	@Override
	public void initialize( URL arg0, ResourceBundle arg1 )
	{
		try
		{
			// clear data from chart
			chart.getData().clear();
			
			XYChart.Series<String, Integer> portfolio = new XYChart.Series<String, Integer>();
			portfolio.setName("Your Portfolio");
			
			XYChart.Series<String, Integer> target = new XYChart.Series<String, Integer>();
			target.setName("FIRE Goal");
			
			for( Map.Entry<String, Integer> data : model.getPortfolioData().entrySet() )
			{
				portfolio.getData().add( new XYChart.Data<String, Integer>(data.getKey(), data.getValue()) );
			}
			
			for( Map.Entry<String, Integer> data : model.getGoalData().entrySet() )
			{
				target.getData().add( new XYChart.Data<String, Integer>(data.getKey(), data.getValue()) );
			}
			
			// display data to chart
			chart.getData().add( target );
			chart.getData().add( portfolio );
			
			if( model.willFIRE() == true )
			{
				firstText.setText( "You can achieve\nFinancial Independence in" );
				timeText.setText( (model.getFIREAge() - model.getAge()) + " YEARS BY AGE " + model.getFIREAge() );
				goalText.setText( "FIRE GOAL: $" + String.format("%,d", model.getFIREGoal()) );
			}
			else
			{
				firstText.setText( "You won't achieve\nFinancial Independence in time" );
				timeText.setText( "YOU SHOULD SAVE MORE EARLY" );
				goalText.setText( "FIRE GOAL: $" + String.format("%,d", model.getFIREGoal()) );
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}

    /**
	 * clickBack() switch to the Question2 scene after clicking the button from the
	 * Graph scene
	 * 
	 * @param event, ActionEvent object that activates after a button click
	 * @return nothing, void
	 * @throws IOException
	 */
	@FXML
	void clickBack(ActionEvent event) throws IOException
	{
		URL url = new File( "src/application/view/Question2.fxml" ).toURI().toURL();
		graphMenu = FXMLLoader.load( url );
		Scene scene = new Scene( graphMenu );
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene( scene );
		window.show();
	}
}
