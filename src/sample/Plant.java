package sample;

import java.io.Serializable;

public class Plant extends Characters implements Serializable {
    private int sun_token_price;
    private int waiting_time;

    public Plant(int hp, boolean alive, int level_unlock, int damage, String name, String url, int sun_token_price, int waiting_time) {
        super(hp, alive, level_unlock, damage, name, url);
        this.sun_token_price = sun_token_price;
        this.waiting_time = waiting_time;
    }

    public int getSun_token_price() {
        return sun_token_price;
    }

    public void setSun_token_price(int sun_token_price) {
        this.sun_token_price = sun_token_price;
    }

    public int getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_time(int waiting_time) {
        this.waiting_time = waiting_time;
    }
}
