package org.example.budgetingapp;

import BudgetingApp.Account;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.ArrayList;

public class BudgetController {
    private Account credit, chequing, savings;
    @FXML
    private Label creditLabelAmount = new Label();
    @FXML
    private Label chequingsLabelAmount = new Label();
    @FXML
    private Label savingsLabelAmount = new Label();
    @FXML
    private Label netWorthLabel, creditLabelText;


    @FXML
    protected void onAddNewAccountButtonClick() {
    }

    @FXML
    protected void onNewOperationButtonClick() {
        BudgetApplication app = new BudgetApplication();
        app.getChequing(); // By this, this class can communicate with the public methods from BudgetApplication

    }

    @FXML
    protected void onTransactionButtonClick() throws IOException {
        FXMLLoader fxmlTransactionView = new FXMLLoader(BudgetApplication.class.getResource("Transaction-view.fxml"));
        Scene transactionScene = new Scene(fxmlTransactionView.load(), 283, 452);
        BudgetApplication.setScene(transactionScene, "Transaction");
    }
}
