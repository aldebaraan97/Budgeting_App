package org.example.budgetingapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class TransactionViewController {
    @FXML
    private Label amount;

    @FXML
    protected void onBackButtonClicked() throws IOException {
        BudgetApplication.mainScene();
    }
}
