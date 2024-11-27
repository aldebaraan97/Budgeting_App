package org.example.budgetingapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BudgetApplication extends Application {
    private static Stage stage;
    private final Account credit = new Account("Credit", 0);
    private final Account chequing = new Account("Chequing", 0);
    private final Account savings = new Account("Savings", 0);
    private ArrayList<Account> account = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        account.add(credit);
        account.add(chequing);
        account.add(savings);
        this.stage = stage;

        // Load main face
        FXMLLoader fxmlBudgetView = new FXMLLoader(BudgetApplication.class.getResource("Budget-view.fxml"));
        Scene budgetScene = new Scene(fxmlBudgetView.load(), 283, 452);
        stage.setScene(budgetScene);
        stage.setTitle("Budget");
        stage.show();

//        mainScene();
    }

//    public static void mainScene() throws IOException {
//        // Budget fxml view
//        FXMLLoader fxmlBudgetView = new FXMLLoader(BudgetApplication.class.getResource("Budget-view.fxml"));
//        Scene budgetScene = new Scene(fxmlBudgetView.load(), 283, 452);
//        setScene(budgetScene, "BudgetingApp"); // set scene and display the GUI
//    }

    public static void setScene(Scene scene, String title) {
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public Account getCredit() {
        return credit;
    }
    public Account getChequing() {
        return chequing;
    }
    public Account getSavings() {
        return savings;
    }
}




