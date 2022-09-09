package model.weapon.describe;

import model.weapon.Movement;
import model.weapon.PhysicalAttack;

public class WeaponDescription {
    private PhysicalAttack physicalAttack;
    private Movement movement;
    private static int money=0;
    public WeaponDescription() {
    }

    public WeaponDescription(PhysicalAttack physicalAttack, Movement movement, int money) {
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
        return "physicalAttack"+'{' + physicalAttack +
                ", movement=" + movement +
                ", money=" + money +
                '}';
    }
}