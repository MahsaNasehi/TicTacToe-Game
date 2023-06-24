package com.example.workshop12;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Util {
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String name){
        Parent root = null;
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Util.class.getResource(fxmlFile));
                root = fxmlLoader.load();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setTitle(title);
                stage.setScene(scene);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

}
