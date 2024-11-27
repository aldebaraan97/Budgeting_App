package org.example.budgetingapp;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class TransactionViewController {
    @FXML
    private Label amount;
    @FXML
    private TextField amountField;
    @FXML
    MenuItem fromCredit = new MenuItem("To Credit");
    @FXML
    MenuItem fromChequing = new MenuItem("To Chequing");
    @FXML
    MenuItem fromSavings = new MenuItem("To Savings");
    @FXML
    MenuButton selectAccountBt = new MenuButton();

    @FXML
    protected void onBackButtonClicked() throws IOException {
        BudgetApplication.mainScene();
    }

    @FXML
    protected void onCompleteButtonClicked() throws IOException {
        BudgetApplication app = new BudgetApplication();
        String fromAccount;
    }

    @FXML
    protected void onCreditButtonClicked() throws IOException {
        selectAccountBt.setText("Credit");
    }

    @FXML
    protected void onChequingButtonClicked() throws IOException {
        selectAccountBt.setText("Chequing");
    }

    @FXML
    protected void onSavingsButtonClicked() throws IOException {
        selectAccountBt.setText("Savings");
    }
}
