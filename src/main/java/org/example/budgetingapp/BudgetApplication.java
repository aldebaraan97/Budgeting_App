package org.example.budgetingapp;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class BudgetApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        // ArrayList to hold all the scenes in the app
        ArrayList<Scene> scenes = new ArrayList<>();
        mainScene();
    }

    public static void setScene(Scene scene, String title) {
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void mainScene() throws IOException {
        // Budget fxml view
        FXMLLoader fxmlBudgetView = new FXMLLoader(BudgetApplication.class.getResource("Budget-view.fxml"));
        Scene budgetScene = new Scene(fxmlBudgetView.load(), 283, 452);
        // set scene and display the GUI
        setScene(budgetScene, "BudgetingApp");
    }
}
