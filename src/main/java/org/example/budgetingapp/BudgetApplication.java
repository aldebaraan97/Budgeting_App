package org.example.budgetingapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BudgetApplication extends Application {
    private static Stage stage;
    private ArrayList<Account> account = new ArrayList<>();


    @Override
    public void start(Stage stage) throws IOException {
        Account credit = new Account("Credit", 0);
        Account debit = new Account("Debit", 0);
        Account savings = new Account("Savings", 0);
        account.add(credit);
        account.add(debit);
        account.add(savings);

        this.stage = stage;


//        BudgetController.
        mainScene();
    }

    public static void mainScene() throws IOException {

        // Budget fxml view
        FXMLLoader fxmlBudgetView = new FXMLLoader(BudgetApplication.class.getResource("Budget-view.fxml"));
        Scene budgetScene = new Scene(fxmlBudgetView.load(), 283, 452);
        // set scene and display the GUI
        setScene(budgetScene, "BudgetingApp");
    }

    public static void setScene(Scene scene, String title) {
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public int testClass() {
        return 0;
    }

    public void testingMethod() {

    }
}


