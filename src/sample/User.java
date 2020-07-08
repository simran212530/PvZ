package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private static User user;
//Singleton Design
    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    private int level;
    private int sun_tokens;
    private ArrayList<Plant> plants_unlocked;
    private ArrayList<Zombie> zombies_unlocked;
    private ArrayList<Plant> side_plants;

    public User() {
        this.level = 1;
        this.plants_unlocked = new ArrayList<>();
        this.zombies_unlocked = new ArrayList<>();
        this.side_plants = new ArrayList<>();
    }

    public int getSun_tokens() {
        return sun_tokens;
    }

    public void setSun_tokens(int sun_tokens) {
        this.sun_tokens = sun_tokens;
    }

    public User(int level, ArrayList<Plant> plants_unlocked, ArrayList<Zombie> zombies_unlocked, ArrayList<Plant> side_plants, Garden garden) {
        this.level = level;
        this.plants_unlocked = plants_unlocked;
        this.zombies_unlocked = zombies_unlocked;
        this.side_plants = side_plants;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Plant> getPlants_unlocked() {
        return plants_unlocked;
    }

    public void setPlants_unlocked(ArrayList<Plant> plants_unlocked) {
        this.plants_unlocked = plants_unlocked;
    }

    public ArrayList<Zombie> getZombies_unlocked() {
        return zombies_unlocked;
    }

    public void setZombies_unlocked(ArrayList<Zombie> zombies_unlocked) {
        this.zombies_unlocked = zombies_unlocked;
    }

    public ArrayList<Plant> getSide_plants() {
        return side_plants;
    }

    public void setSide_plants(ArrayList<Plant> side_plants) {
        this.side_plants = side_plants;
    }
}
