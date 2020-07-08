package sample;

import java.io.Serializable;

public class Conehead extends Zombie implements Serializable {
    public Conehead(int start_time, int speed) {
        super(14, true, 2, 2, "Conehead", "file:/C:/Users/1hrit/OneDrive/Desktop/Hrithik/IIITD/Second%20Year/First%20Semester/CSE201/AP_2018236_2018336_Project/src/Images/zombie_normal.gif", start_time, speed);
    }
}
