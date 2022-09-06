package controller.weapon;

public class Weapon {
    private String Name;
    private double CoolDownReduction;
    public Weapon(){};

    public Weapon(String name, double coolDown) {
        Name = name;
        CoolDownReduction = coolDown;
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
}
