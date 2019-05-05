package javaFX2password;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class PasswordController {

	@FXML
	private TextField txf;

	@FXML
	private PasswordField pwf;

	@FXML
	private Label lbl;

	@FXML
	void initialize() {
		assert txf != null : "fx:id=\"txf\" was not injected: check your FXML file 'Password.fxml'.";
		assert pwf != null : "fx:id=\"pwf\" was not injected: check your FXML file 'Password.fxml'.";
		assert lbl != null : "fx:id=\"lbl\" was not injected: check your FXML file 'Password.fxml'.";

		this.pwf.setPromptText("Enter your password.");

	}

	@FXML
	void txfKeyPressed(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER) {
			this.pwf.requestFocus();
		}
	}

	@FXML
	void pwfKeyPressed(KeyEvent e) {
		if (e.getCode() == KeyCode.ENTER) {
			if (this.pwf.getText().equalsIgnoreCase("password")) {
				this.lbl.setTextFill(Color.GREEN);
				this.lbl.setText("Your password has been confirmed.");
				this.txf.requestFocus();
			}
			else {
				this.lbl.setTextFill(Color.RED);
				this.lbl.setText("Your password is incorrect!");
			}
			this.pwf.clear();
		}
	}
}
