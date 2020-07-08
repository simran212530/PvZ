package sample;

import java.io.Serializable;

public class Barrier extends Plant implements Serializable {
    public Barrier(int hp, boolean alive, int level_unlock, int damage, String name, String url, int sun_token_price, int waiting_time) {
        super(hp, alive, level_unlock, damage, name, url, sun_token_price, waiting_time);
    }
}
