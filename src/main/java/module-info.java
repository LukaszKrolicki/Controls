module com.example.controls {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.controls to javafx.fxml;
    exports com.example.controls;
}