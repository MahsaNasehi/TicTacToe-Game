package com.example.workshop12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController {

    @FXML
    private Button exit_butt;

    @FXML
    private Button start_butt;

    @FXML
    void clickExit(ActionEvent event) {
        Stage stage = (Stage) exit_butt.getScene().getWindow();
        stage.close();
    }

    @FXML
    void clickStart(ActionEvent event) {
        Util.changeScene(event, "Log_in.fxml", "log in", null);
    }

}
