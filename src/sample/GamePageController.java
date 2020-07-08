package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.ForkJoinPool;

public class GamePageController implements Initializable, Serializable {

    private Game game;
    private ForkJoinPool pool;

    public GamePageController() {
        this.garden = new Garden();
        this.game = new Game();
        this.pool = new ForkJoinPool(2);
        this.zombies_left = new Label();
        this.waves = new Label();
        this.sun_token_counter = new Label();
    }

    public GamePageController(Garden garden) {
        this.garden = garden;
        this.zombies_left = new Label();
        this.waves = new Label();
        this.sun_token_counter = new Label();
    }

    @FXML
    private Label waves;

    @FXML
    private Label zombies_left;

    @FXML
    private AnchorPane anchorPane;

    private Garden garden;

    @FXML
    private Button pause;

    @FXML
    private Label sun_token_counter;

    @FXML
    private Button plant;

    @FXML
    private Button pea;

    @FXML
    public void shoot(ActionEvent event) {
        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setNode(this.pea);
        translateTransition.setByX(3000);
        translateTransition.setDuration(Duration.seconds(10));
    }

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
    public void serialize() throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("out.txt"));
            out.writeObject(this.garden);
        } finally {
            out.close();
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

    @Override
    public void initialize(URL location, ResourceBundle resources){
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                try{
                    startsuns();
                    startzombies();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        timer.start();
//        AnimationTimer animationTimer = new AnimationTimer() {
//            @Override
//            public void handle(long now) {
//
//            }
//        };
//        animationTimer.start();
    }

    private void startsuns() {
        Random random = new Random();
//        String url = "";
//        try {
//            url = new File("src/Images/sun.png").getCanonicalPath();
//            System.out.println(url);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Image image = new Image(url);
        int val = random.nextInt(600);
        this.garden.getSuns().forEach((s) -> s.move());
//        Sun sun = null;
        if (val == 300) {
            Sun sun = new Sun();
            this.garden.getSuns().add(sun);
//            System.out.println(this.garden.getSuns());
            sun.getImage().setFitHeight(50);
            sun.getImage().setFitWidth(50);
            sun.getImage().setY(0);
            int x_coordinate = random.nextInt(800) + 400;
            sun.getImage().setTranslateX(x_coordinate);
            this.anchorPane.getChildren().add(sun.getImage());
            sun.getImage().setTranslateY(sun.getImage().getTranslateY() + 0.2);
            sun.getImage().setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    sun_touched(sun);
                }
            });
        }
//        for (int i = 0; i < this.garden.getSuns().size(); i++) {
//            this.garden.getSuns().get(i).getImage().setTranslateY(this.garden.getSuns().get(i).getImage().getY() + 1);
//        }
    }

    private void startzombies() throws Exception {
        if (this.garden.getZombie_frequency() == 0) {
            return;
        }
        Random random = new Random();
//        String url = "";
//        try {
//            url = new File("src/Images/sun.png").getCanonicalPath();
//            System.out.println(url);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        Image image = new Image(url);
        int val = random.nextInt(600);
        this.garden.getZombies().forEach((s) -> s.move());
//        Sun sun = null;
        if (val == 300) {
            this.garden.setZombie_frequency(this.garden.getZombie_frequency() - 1);
            MyLabel label=new MyLabel();
            label.setLabel1(this.zombies_left);
            label.setLabel2(this.waves);
            label.setVal1(this.garden.getZombie_frequency());
            label.setVal2(this.garden.getNumber_of_waves());
            label.setlabels();

            Thread left = new Thread(label);
            left.join();
//            pool.invoke(left);
//            pool.invoke(right);

            if (this.garden.getZombie_frequency() == 0) {
                if (this.garden.getNumber_of_waves() > 0) {
                    this.garden.setNumber_of_waves(this.garden.getNumber_of_waves() - 1);
                    this.garden.setZombie_frequency(20);
                }
            }
            if (this.garden.getNumber_of_waves() == 0) {
                System.exit(0);
            }
            Zombie zombie = null;
            int[] y_coordinates = {195, 285, 375, 475, 570};
            int choice = random.nextInt(this.garden.getUser().getLevel());
            if (choice == 1) {
                zombie = new Normal(0, 1);
            } else if (choice == 2) {
                zombie = new Conehead(0, 1);
            } else if (choice == 3) {
                zombie = new Newspaper(0, 1);
            } else {
                zombie = new Bucket_Head(0, 1);
            }
            this.garden.getZombies().add(zombie);
//            System.out.println(this.garden.getSuns());
            zombie.getImage().setFitHeight(100);
            zombie.getImage().setFitWidth(55);
            zombie.getImage().setY(y_coordinates[random.nextInt(5)]);
            int x_coordinate = random.nextInt(30) + 1450;
            zombie.getImage().setTranslateX(x_coordinate);
            this.anchorPane.getChildren().add(zombie.getImage());
            zombie.getImage().setTranslateX(zombie.getImage().getTranslateX() - 0.2);
        }
    }

    @FXML
    public void moveLawnMower(ActionEvent event) {

    }

    @FXML
    public void inGame(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InGameOptions.fxml"));
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

    public void sun_touched(Sun sun) {
        int count = sun.touch(this.sun_token_counter);
        this.garden.setSun_token_counter(count);
        this.garden.getUser().setSun_tokens(count);
        this.sun_token_counter.setText(String.valueOf(count));
        sun.getImage().setVisible(false);
    }
}
