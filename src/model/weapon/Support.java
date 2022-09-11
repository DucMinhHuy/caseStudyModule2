package model.weapon;

import model.Weapon;

import java.io.Serializable;

public class Support extends Weapon implements Serializable {
    private double Hp=0;
    private double MovementSpeed=0;// % di chuyen
    private int AbilityPowerWeapon=0;
    private int NormalAttack=0;//cong vat ly

    public Support(String name, double coolDownReduction, double hp, double movementSpeed, int abilityPowerWeapon, int normalAttack) {
        super(name, coolDownReduction);
        Hp = hp;
        MovementSpeed = movementSpeed;
        AbilityPowerWeapon = abilityPowerWeapon;
        NormalAttack = normalAttack;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public int getAbilityMagic() {
        return AbilityPowerWeapon;
    }

    public void setAbilityMagic(int abilityMagic) {
        AbilityPowerWeapon = abilityMagic;
    }

    public int getNormalAttack() {
        return NormalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        NormalAttack = normalAttack;
    }

    @Override
    public String toString() {
        return "Support{"+super.toString()+
                "Hp=" + Hp +
                ", MovementSpeed=" + MovementSpeed +
                ", AbilityPowerWeapon=" + AbilityPowerWeapon +
                ", NormalAttack=" + NormalAttack +
                '}';
    }
}
