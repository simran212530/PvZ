package sample;

import java.io.Serializable;

public class Bomb extends Plant implements Serializable {
    private int affected_radius;
    private int explode_time;

    public Bomb(int hp, boolean alive, int level_unlock, int damage, String name, String url, int sun_token_price, int waiting_time, int affected_radius, int explode_time) {
        super(hp, alive, level_unlock, damage, name, url, sun_token_price, waiting_time);
        this.affected_radius = affected_radius;
        this.explode_time = explode_time;
    }

    public void explode() {

    }

    public int getAffected_radius() {
        return affected_radius;
    }

    public void setAffected_radius(int affected_radius) {
        this.affected_radius = affected_radius;
    }

    public int getExplode_time() {
        return explode_time;
    }

    public void setExplode_time(int explode_time) {
        this.explode_time = explode_time;
    }
}
