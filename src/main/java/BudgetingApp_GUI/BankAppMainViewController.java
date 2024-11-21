package BudgetingApp_GUI;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BankAppMainViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
