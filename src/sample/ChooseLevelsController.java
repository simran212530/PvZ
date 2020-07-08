package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Serializable;

public class ChooseLevelsController implements Serializable {
    @FXML
    public void level_1(ActionEvent event) {
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

    @FXML
    public void level_2(ActionEvent event) {
        if (User.getInstance().getLevel() < 2) {
            return;
        }
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

    @FXML
    public void level_3(ActionEvent event) {
        if (User.getInstance().getLevel() < 3) {
            return;
        }
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


    @FXML
    public void level_4(ActionEvent event) {
        if (User.getInstance().getLevel() < 4) {
            return;
        }
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

    @FXML
    public void level_5(ActionEvent event) {
        if (User.getInstance().getLevel() < 5) {
            return;
        }
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

    @FXML
    public void exit(ActionEvent event) {
        System.exit(0);
    }
}
