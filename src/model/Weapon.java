package model;

import java.io.Serializable;

public class Weapon implements Serializable {
    private String Name;
    private double CoolDownReduction=0;
    public Weapon(){};

    public Weapon(String name, double coolDownReduction) {
        Name = name;
        CoolDownReduction = coolDownReduction;// hoio chieu
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getCoolDown() {
        return CoolDownReduction;
    }

    public void setCoolDown(double coolDown) {
        CoolDownReduction = coolDown;
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", CoolDownReduction=" + CoolDownReduction +
                '}';
    }
}
