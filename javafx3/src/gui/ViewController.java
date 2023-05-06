package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button buttonTest;
	
	@FXML
	public void onButtonTestAction() {
		Alerts.showAlert("Alert title", null, "hello", AlertType.WARNING);
	}
}