package org.example.budgetingapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.ArrayList;

public class BudgetController {
    private final BudgetApplication app = new BudgetApplication();
    private final Account credit = new Account("Credit", 0);
    private final Account chequing = new Account("Chequing", 0);
    private final Account savings = new Account("Savings", 0);
    @FXML
    private Label creditLabelAmount = new Label(app.getCredit().getRemainingBudget().toString());
    @FXML
    private Label chequingsLabelAmount = new Label(app.getChequing().getRemainingBudget().toString());
    @FXML
    private Label savingsLabelAmount = new Label(app.getSavings().getRemainingBudget().toString());
    @FXML
    private Label netWorthLabel, creditLabelText;

    public void initialize() {
        creditLabelAmount.setText(app.getCredit().getRemainingBudget().toString());
        chequingsLabelAmount.setText(app.getChequing().getRemainingBudget().toString());
        savingsLabelAmount.setText(app.getSavings().getRemainingBudget().toString());
    }

    @FXML
    protected void onAddNewAccountButtonClick() {
    }

    @FXML
    protected void onNewOperationButtonClick() {
        BudgetApplication app = new BudgetApplication();
//        app.getChequing(); // By this, this class can communicate with the public methods from BudgetApplication

    }

    @FXML
    protected void onTransactionButtonClick() throws IOException {
        FXMLLoader fxmlTransactionView = new FXMLLoader(BudgetApplication.class.getResource("Transaction-view.fxml"));
        Scene transactionScene = new Scene(fxmlTransactionView.load(), 283, 452);
        BudgetApplication.setScene(transactionScene, "Transaction");
    }

}
