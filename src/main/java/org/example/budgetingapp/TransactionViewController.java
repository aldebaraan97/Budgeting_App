package org.example.budgetingapp;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class TransactionViewController {
    private final BudgetApplication app = new BudgetApplication();
    @FXML
    private Label amount = new Label();
    @FXML
    private TextField amountField = new TextField();
    @FXML
    private MenuItem fromCredit = new MenuItem("To Credit");
    @FXML
    private MenuItem fromChequing = new MenuItem("To Chequing");
    @FXML
    private MenuItem fromSavings = new MenuItem("To Savings");
    @FXML
    private MenuItem toCredit = new MenuItem("To Credit");
    @FXML
    private MenuItem toChequing = new MenuItem("To Chequing");
    @FXML
    private MenuItem toSavings = new MenuItem("To Savings");
    @FXML
    private MenuButton fromAccountBt = new MenuButton();
    @FXML
    private MenuButton toAccountBt = new MenuButton();

    @FXML
    protected void onBackButtonClicked() throws IOException {
//        BudgetApplication.mainScene();
    }

    @FXML
    protected void onCompleteButtonClicked() throws IOException {
        String fromAccount = fromAccountBt.getText();
        String toAccount = toAccountBt.getText();

        switch (fromAccount) {
            case "Credit": app.getCredit().addExpense(Double.parseDouble(amountField.getText()));
            case "Chequing": app.getChequing().addExpense(Double.parseDouble(amountField.getText()));
            case "Savings": app.getSavings().addExpense(Double.parseDouble(amountField.getText()));
        }
        System.out.println(app.getChequing().getRemainingBudget());
        System.out.println(app.getSavings().getRemainingBudget());
        System.out.println(app.getCredit().getRemainingBudget());
        switch (toAccount) {
            case "Credit": app.getCredit().addToBudget(Double.parseDouble(amountField.getText()));
            case "Chequing": app.getChequing().addToBudget(Double.parseDouble(amountField.getText()));
            case "Savings": app.getSavings().addToBudget(Double.parseDouble(amountField.getText()));
        }
//        BudgetApplication.mainScene();
    }

    @FXML
    protected void onCreditButtonClicked() throws IOException {
        fromAccountBt.setText("Credit");
    }
    @FXML
    protected void onChequingButtonClicked() throws IOException {
        fromAccountBt.setText("Chequing");
    }
    @FXML
    protected void onSavingsButtonClicked() throws IOException {
        fromAccountBt.setText("Savings");
    }
    @FXML
    protected void onToCreditButtonClicked() throws IOException {
        toAccountBt.setText("Credit");
    }
    @FXML
    protected void onToChequingButtonClicked() throws IOException {
        toAccountBt.setText("Chequing");
    }
    @FXML
    protected void onToSavingsButtonClicked() throws IOException {
        toAccountBt.setText("Savings");
    }

}
