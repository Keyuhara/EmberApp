package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Question3_ExpensesController {
	 @FXML
	 private AnchorPane anchorPane;


    @FXML
    void toIncome(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question2_Income.fxml"));
    	Scene scene = new Scene(anchorPane);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void toNetWorth(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question4_NetWorth.fxml"));
    	Scene scene = new Scene(anchorPane);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

}
