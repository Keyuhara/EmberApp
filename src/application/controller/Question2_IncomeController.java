package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Question2_IncomeController {
	@FXML
    private AnchorPane anchorPane;


    @FXML
    void toAge(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question1_Age.fxml"));
    	Scene scene = new Scene(anchorPane);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void toExpenses(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question3_Expenses.fxml"));
    	Scene scene = new Scene(anchorPane);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

}
