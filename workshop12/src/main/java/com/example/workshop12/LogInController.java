package com.example.workshop12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LogInController {

    @FXML
    private Button back_butt;

    @FXML
    private Button go_butt;

    @FXML
    private TextField name_text;


    @FXML
    private Button name_alert_label;
    @FXML
    void clickBack(ActionEvent event) {
        Util.changeScene(event, "Start_scene.fxml", "Tic Tac Start!", null);
    }

    @FXML
    void clickGo(ActionEvent event) {
        String name = name_text.getText();
        if (name == null){
            name_alert_label.setText("enter your name!");
        }else {
            Util.changeScene(event, ".fxml", "Let's play", name);
        }
    }

}
