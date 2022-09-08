package controller.listWeapons;

import controller.vukhi.Longinus;
import controller.vukhi.HolySword;
public class WeaponsDam {

    private Longinus longinus=new Longinus();
    private HolySword holySword=new HolySword();

    public WeaponsDam(Longinus longinus, HolySword holySword) {
        this.longinus = longinus;
        this.holySword = holySword;
    }

    public Longinus getLonginus() {
        return longinus;
    }

    public void setLonginus(Longinus longinus) {
        this.longinus = longinus;
    }

    public HolySword getHolySword() {
        return holySword;
    }

    public void setHolySword(HolySword holySword) {
        this.holySword = holySword;
    }

    public WeaponsDam(){}

}
