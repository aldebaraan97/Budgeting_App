module org.example.budgetingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.budgetingapp;
    exports org.example.budgetingapp to  javafx.fxml;
}
