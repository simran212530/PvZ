package sample;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;

public class Sun implements Serializable {
    private int value;
    private int radius;
    private ImageView image;

    public Sun() {
        this.value = 25;
        this.radius = 25;
        this.image = new ImageView(new Image("file:/C:/Users/1hrit/OneDrive/Desktop/Hrithik/IIITD/Second%20Year/First%20Semester/CSE201/AP_2018236_2018336_Project/src/Images/sun.png"));
    }

    public Sun(int value, int radius) {
        this.value = value;
        this.radius = radius;
    }

//    Template Design
    public final int touch(Label label) {
        int count = Integer.parseInt(label.getText());
        count = addValue(count);
        return count;
    }


    private int addValue(int count) {
        return count + this.value;
    }

    public void move() {
        this.image.setTranslateY(this.image.getTranslateY() + 0.2);
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
