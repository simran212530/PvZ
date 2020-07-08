package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.Serializable;

public abstract class Characters implements Serializable {
    private int hp;
    private boolean alive;
    private int level_unlock;
    private int damage;
    private float position_x;
    private float position_y;
    private String name;
    private ImageView image;

    public Characters(int hp, boolean alive, int level_unlock, int damage, String name, String url) {
        this.hp = hp;
        this.alive = alive;
        this.level_unlock = level_unlock;
        this.damage = damage;
        this.name = name;
        this.image = new ImageView(new Image(url));
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getLevel_unlock() {
        return level_unlock;
    }

    public void setLevel_unlock(int level_unlock) {
        this.level_unlock = level_unlock;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getPosition_x() {
        return position_x;
    }

    public void setPosition_x(float position_x) {
        this.position_x = position_x;
    }

    public float getPosition_y() {
        return position_y;
    }

    public void setPosition_y(float position_y) {
        this.position_y = position_y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
