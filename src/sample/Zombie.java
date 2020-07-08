package sample;

import java.io.Serializable;

public class Zombie extends Characters implements Serializable {
    private int start_time;
    private int speed;

    public Zombie(int hp, boolean alive, int level_unlock, int damage, String name, String url, int start_time, int speed) {
        super(hp, alive, level_unlock, damage, name, url);
        this.start_time = start_time;
        this.speed = speed;
    }

    public void eat(){

    }

    public void move(){
        this.getImage().setTranslateX(this.getImage().getTranslateX()-0.2);
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
