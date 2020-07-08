package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Garden implements Serializable {
    private ArrayList<Zombie> zombies;
    private User user;
    private ArrayList<Sun> suns;
    private ArrayList<Plant> plants;
    private ArrayList<GardenMower> gardenMowers;
    private int sun_token_counter;
    private int zombie_frequency;
    private int number_of_waves;

    public Garden() {
        this.zombies = new ArrayList<>();
        this.gardenMowers = new ArrayList<>();
        this.plants = new ArrayList<>();
        this.number_of_waves = 3 + (User.getInstance().getLevel()-1);
        this.zombie_frequency = 20 + (User.getInstance().getLevel()-1)*5;
        this.suns = new ArrayList<>();
        this.user = new User();
    }

    public Garden(ArrayList<Zombie> zombies, User user, ArrayList<Plant> plants, ArrayList<GardenMower> gardenMowers, int sun_token_counter, int zombie_frequency, int number_of_waves) {
        this.zombies = zombies;
        this.user = user;
        this.plants = plants;
        this.gardenMowers = gardenMowers;
        this.sun_token_counter = sun_token_counter;
        this.zombie_frequency = zombie_frequency;
        this.number_of_waves = number_of_waves;
    }

    public void sun_token_generator() {

    }

    public void game_over() {

    }

    public void game_win() {

    }

    public void generate_zombies() {

    }

    public ArrayList<Sun> getSuns() {
        return suns;
    }

    public void setSuns(ArrayList<Sun> suns) {
        this.suns = suns;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Plant> getPlants() {
        return plants;
    }

    public void setPlants(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public ArrayList<GardenMower> getGardenMowers() {
        return gardenMowers;
    }

    public void setGardenMowers(ArrayList<GardenMower> gardenMowers) {
        this.gardenMowers = gardenMowers;
    }

    public int getSun_token_counter() {
        return sun_token_counter;
    }

    public void setSun_token_counter(int sun_token_counter) {
        this.sun_token_counter = sun_token_counter;
    }

    public int getZombie_frequency() {
        return zombie_frequency;
    }

    public void setZombie_frequency(int zombie_frequency) {
        this.zombie_frequency = zombie_frequency;
    }

    public int getNumber_of_waves() {
        return number_of_waves;
    }

    public void setNumber_of_waves(int number_of_waves) {
        this.number_of_waves = number_of_waves;
    }
}
