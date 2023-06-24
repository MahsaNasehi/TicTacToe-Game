module com.example.workshop12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workshop12 to javafx.fxml;
    exports com.example.workshop12;
}