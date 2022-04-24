package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Question4_NetWorthController {
	
    @FXML
    private AnchorPane anchorPane;

    @FXML
    void toAllocation(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question5_Allocation.fxml"));
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
