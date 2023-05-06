package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button buttonTest;
	
	@FXML
	public void onButtonTestAction() {
		System.out.println("Click!");
	}
}