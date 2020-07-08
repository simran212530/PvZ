package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;

public class GardenMower implements Serializable {
    private int position_x;
    private int position_y;
    private ImageView image;

    public GardenMower(int position_x, int position_y) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.image = new ImageView(new Image("file:/C:/Users/1hrit/OneDrive/Desktop/Hrithik/IIITD/Second%20Year/First%20Semester/CSE201/AP_2018236_2018336_Project/src/Images/Lawn_Mower.png"));
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public void mow_lane(){

    }
    public int getPosition_x() {
        return position_x;
    }

    public void setPosition_x(int position_x) {
        this.position_x = position_x;
    }

    public int getPosition_y() {
        return position_y;
    }

    public void setPosition_y(int position_y) {
        this.position_y = position_y;
    }
}
