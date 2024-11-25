package org.example.budgetingapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class BudgetController {


    @FXML
    private Label netWorthLabel, credit, chequings, $Symbol1, $Symbol2, $Symbol3, creditLabel;

    @FXML
    protected void onNewOperationButtonClick() {
        creditLabel.setText("200");
    }

    @FXML
    protected void onTransactionButtonClick() throws IOException {
        FXMLLoader fxmlTransactionView = new FXMLLoader(BudgetApplication.class.getResource("Transaction-view.fxml"));
        Scene transactionScene = new Scene(fxmlTransactionView.load(), 283, 452);
        BudgetApplication.setScene(transactionScene, "Transaction");
    }
}
