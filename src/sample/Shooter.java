package sample;

import java.io.Serializable;

public class Shooter extends Plant implements Serializable {
    private float firing_rate;

    public Shooter(int hp, boolean alive, int level_unlock, int damage, String name, String url, int sun_token_price, int waiting_time, float firing_rate) {
        super(hp, alive, level_unlock, damage, name, url, sun_token_price, waiting_time);
        this.firing_rate = firing_rate;
    }

    public float getFiring_rate() {
        return firing_rate;
    }

    public void setFiring_rate(float firing_rate) {
        this.firing_rate = firing_rate;
    }

    public void fire(){

    }
}
