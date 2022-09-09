package model.weapon;

import model.Weapon;

import java.io.Serializable;

public class Magic extends Weapon implements Serializable {
    private int AbilityPowerWeapon=0;// suc manh phep thuat
    private double Hp=0;
    private int ManaWeapon=0;
    private double MovementSpeed=0;//% di chuyen
    private double ArmorWeapon=0;
    private double MagicPierceWeapon=0;

    public Magic(String name, double coolDownReduction, int abilityPowerWeapon, double hp, int manaWeapon, double movementSpeed, double armorWeapon, double magicPierceWeapon) {
        super(name, coolDownReduction);
        AbilityPowerWeapon = abilityPowerWeapon;
        Hp = hp;
        ManaWeapon = manaWeapon;
        MovementSpeed = movementSpeed;
        ArmorWeapon = armorWeapon;
        MagicPierceWeapon = magicPierceWeapon;
    }

    public int getAbilityPower() {
        return AbilityPowerWeapon;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPowerWeapon = abilityPower;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public int getMana() {
        return ManaWeapon;
    }

    public void setMana(int mana) {
        ManaWeapon = mana;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public double getArmor() {
        return ArmorWeapon;
    }

    public void setArmor(double armor) {
        ArmorWeapon = armor;
    }

    public double getMagicPierce() {
        return MagicPierceWeapon;
    }

    public void setMagicPierce(double magicPierce) {
        MagicPierceWeapon = magicPierce;
    }

    @Override
    public String toString() {
        return "Magic{" +super.toString()+
                "AbilityPowerWeapon=" + AbilityPowerWeapon +
                ", Hp=" + Hp +
                ", ManaWeapon=" + ManaWeapon +
                ", MovementSpeed=" + MovementSpeed +
                ", ArmorWeapon=" + ArmorWeapon +
                ", MagicPierceWeapon=" + MagicPierceWeapon +
                '}';
    }
}
