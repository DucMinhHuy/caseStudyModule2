package model.weapon;

import model.Weapon;

import java.io.Serializable;

public class Movement extends Weapon implements Serializable {
    //giay toc chay
    private double ArmorWeapon=0;
    private double MagicDefensed=0; //khang phep
    private double MovementSpeed=0;//% di chuyen
    private int AbilityPowerWeapon=0;
    private double AttackSpeedWeapon=0;// toc do danh
public Movement(){}
    public Movement(String name, double coolDownReduction, double armorWeapon, double magicDefensed, double movementSpeed, int abilityPowerWeapon, double attackSpeedWeapon) {
        super(name, coolDownReduction);
        ArmorWeapon = armorWeapon;
        MagicDefensed = magicDefensed;
        MovementSpeed = movementSpeed;
        AbilityPowerWeapon = abilityPowerWeapon;
        AttackSpeedWeapon = attackSpeedWeapon;
    }

    public double getArmor() {
        return ArmorWeapon;
    }

    public void setArmor(double armor) {
        ArmorWeapon = armor;
    }

    public double getMagicDefense() {
        return MagicDefensed;
    }

    public void setMagicDefense(double magicDefense) {
        MagicDefensed = magicDefense;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public int getAbilityPower() {
        return AbilityPowerWeapon;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPowerWeapon = abilityPower;
    }

    public double getAttackSpeep() {
        return AttackSpeedWeapon;
    }

    public void setAttackSpeep(double attackSpeep) {
        AttackSpeedWeapon = attackSpeep;
    }

    @Override
    public String toString() {
        return "ArmorWeapon=" + ArmorWeapon +
                ", MagicDefensed=" + MagicDefensed +
                ", MovementSpeed=" + MovementSpeed +
                ", AbilityPowerWeapon=" + AbilityPowerWeapon +
                ", AttackSpeedWeapon=" + AttackSpeedWeapon;
    }
}
