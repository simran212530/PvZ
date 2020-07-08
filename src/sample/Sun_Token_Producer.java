package sample;

import java.io.Serializable;

public class Sun_Token_Producer extends Plant implements Serializable {
    private int production_rate;
    private Sun sun;

    public Sun_Token_Producer(int hp, boolean alive, int level_unlock, int damage, String name, String url, int sun_token_price, int waiting_time, int production_rate, Sun sun) {
        super(hp, alive, level_unlock, damage, name, url, sun_token_price, waiting_time);
        this.production_rate = production_rate;
        this.sun = sun;
    }

    public void produce_Sun() {

    }

    public int getProduction_rate() {
        return production_rate;
    }

    public void setProduction_rate(int production_rate) {
        this.production_rate = production_rate;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }
}
