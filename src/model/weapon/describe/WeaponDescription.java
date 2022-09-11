package model.weapon.describe;

import model.weapon.Movement;
import model.weapon.PhysicalAttack;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Objects;

public class WeaponDescription implements Serializable,Comparable<WeaponDescription>{
    private PhysicalAttack physicalAttack;
    private Movement movement;
    private int money;
    public WeaponDescription(String nameWeapon) {
    }

    public WeaponDescription() {
    }

    public WeaponDescription(PhysicalAttack physicalAttack, Movement movement) {
        this.physicalAttack = physicalAttack;
        this.movement = movement;
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
        return   movement +
                ","+physicalAttack +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(@NotNull WeaponDescription o) {
        return this.money-(o.money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponDescription that = (WeaponDescription) o;
//        return money == that.money;
        return Objects.equals(money,that.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalAttack, movement, money);
    }
}
