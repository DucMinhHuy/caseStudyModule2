package controller.vukhi;

import mordor.weapon.Movement;
import mordor.weapon.PhysicalAttack;

public class HolySword {
    private PhysicalAttack physicalAttack;
    private Movement movement;
    private int money=2040;
    public HolySword(){}

    public HolySword(PhysicalAttack physicalAttack, Movement movement, int money) {
        this.physicalAttack = physicalAttack;
        this.movement = movement;
        this.money = money;
    }

    public PhysicalAttack getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(PhysicalAttack physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ThanhKiem{" +super.toString()+
                "physicalAttack=" + physicalAttack +
                ", movement=" + movement +
                ", money=" + money +
                '}';
    }
}
