package controller.listWeapons;

public class MotaWeapon {
    private String name;
    private int coolDown;
    private double Cri;
    public MotaWeapon(){}

    public MotaWeapon(String name, int coolDown, double cri) {
        this.name = name;
        this.coolDown = coolDown;
        Cri = cri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public double getCri() {
        return Cri;
    }

    public void setCri(double cri) {
        Cri = cri;
    }
}
