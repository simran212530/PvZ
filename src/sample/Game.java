package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private ArrayList<Zombie> zombies;
    private ArrayList<Garden> gardens;
    private ArrayList<Plant> plants;
    private ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public ArrayList<Garden> getGardens() {
        return gardens;
    }

    public void setGardens(ArrayList<Garden> gardens) {
        this.gardens = gardens;
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Plant> plants) {
        this.plants = plants;
    }
}
