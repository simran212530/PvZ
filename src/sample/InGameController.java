package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.io.Serializable;

public class InGameController implements Serializable {
    @FXML
    public void exit(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FirstScreen.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle("Plants VS Zombies");
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void save(ActionEvent event) throws IOException {
        GamePageController lol = new GamePageController();
        lol.serialize();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FirstScreen.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle("Plants VS Zombies");
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void resume(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GamePage.fxml"));
            Scene scene = new Scene(root);
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle("Plants VS Zombies");
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
