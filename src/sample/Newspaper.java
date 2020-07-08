package sample;

import java.io.Serializable;

public class Newspaper extends Zombie implements Serializable {

    public Newspaper(int start_time, int speed) {
        super(14, true, 3, 2, "Newspaper", "file:/C:/Users/1hrit/OneDrive/Desktop/Hrithik/IIITD/Second%20Year/First%20Semester/CSE201/AP_2018236_2018336_Project/src/Images/zombie_normal.gif", start_time, speed);
    }

    public void lose_Newspaper(){

    }
}
