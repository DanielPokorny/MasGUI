package MasGUI;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField inputField;
    @FXML
    private TextArea outputField;
    public void processCommand() {
        outputField.setText(outputField.getText() + inputField.getText() + System.getProperty("line.separator"));
    }
}
