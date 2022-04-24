package application.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Question5_AllocationController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    void toNetWorth(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question4_NetWorth.fxml"));
    	Scene scene = new Scene(anchorPane);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }

    @FXML
    void toRateOfReturn(ActionEvent event) throws IOException {
    	anchorPane = FXMLLoader.load(getClass().getResource("../view/Question6_RateOfReturn.fxml"));
    	Scene scene = new Scene(anchorPane);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(scene);
    	window.show();
    }
}
