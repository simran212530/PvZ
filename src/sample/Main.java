package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.Serializable;
import java.net.URL;

public class Main extends Application implements Serializable {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FirstScreen.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Plants VS Zombies");
            primaryStage.setFullScreen(true);
            playSong();
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void playSong() {
        URL resource = getClass().getResource("plants-vs-zombies-soundtrack-main-menu.mp3");
        MediaPlayer a = new MediaPlayer(new Media(resource.toString()));
        a.setOnEndOfMedia(new Runnable() {
            public void run() {
                a.seek(Duration.ZERO);
            }
        });
        a.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
