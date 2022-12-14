package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;


//controller of Contact.fxml page
//in the ContactController.java file we have: back Button, two function.
public class ContactController implements Initializable{

	 @FXML
	    private AnchorPane AnchorPane;

@FXML
private Button back;

private Parent fxml;
//this function is called when the back button is clicked; the user is redirected to Home page
@FXML
void Back() {
	AnchorPane.getScene().getWindow().hide();
	Stage conversion= new Stage();
	try {
	fxml= FXMLLoader.load(getClass().getResource("/interfaces/Home.fxml"));
	Scene scene = new Scene(fxml);
	conversion.setScene(scene);
	conversion.show();
	
}catch(IOException e){
	
}

}
@Override
public void initialize(URL location, ResourceBundle resources) {
	// TODO Auto-generated method stub
	
}
}