package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class FirstScreenController implements Serializable {

    @FXML
    public void newGame(ActionEvent event) {
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

    @FXML
    public void loadGame(ActionEvent event) throws IOException, ClassNotFoundException {
        Garden garden=null;
        if (User.getInstance().getLevel() != 1) {
            ObjectInputStream in = null;
            garden = null;
            try {
                in = new ObjectInputStream(new FileInputStream("out.txt"));
                garden = (Garden) in.readObject();
                GamePageController page = new GamePageController(garden);
            } finally {
                in.close();
            }
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
    public void chooseLevel(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ChooseLevels.fxml"));
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
