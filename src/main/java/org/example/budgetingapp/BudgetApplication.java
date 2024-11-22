package org.example.budgetingapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BudgetApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BudgetApplication.class.getResource("Budget-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 283, 452);
        stage.setTitle("BudgetingApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
