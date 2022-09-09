package model.weapon;

import model.Weapon;

public class Defense extends Weapon {
    private double ArmorWeapon=0;
    private double Hp=0;
    private double HealPerSecond=0;//hoi tren giay
    private int ManaWeapon=0;
    private double MagicDefensed=0;// khang phep

    public Defense(String name, double coolDownReduction, double armorWeapon, double hp, double healPerSecond, int manaWeapon, double magicDefensed) {
        super(name, coolDownReduction);
        ArmorWeapon = armorWeapon;
        Hp = hp;
        HealPerSecond = healPerSecond;
        ManaWeapon = manaWeapon;
        MagicDefensed = magicDefensed;
    }

    public double getArmor() {
        return ArmorWeapon;
    }

    public void setArmor(double armor) {
        ArmorWeapon = armor;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getHealPerSecond() {
        return HealPerSecond;
    }

    public void setHealPerSecond(double healPerSecond) {
        HealPerSecond = healPerSecond;
    }

    public int getMana() {
        return ManaWeapon;
    }

    public void setMana(int mana) {
        ManaWeapon = mana;
    }

    public double getMagicDefense() {
        return MagicDefensed;
    }

    public void setMagicDefense(double magicDefense) {
        MagicDefensed = magicDefense;
    }

    @Override
    public String toString() {
        return "Defense{" +super.toString()+
                "ArmorWeapon=" + ArmorWeapon +
                ", Hp=" + Hp +
                ", HealPerSecond=" + HealPerSecond +
                ", ManaWeapon=" + ManaWeapon +
                ", MagicDefensed=" + MagicDefensed +
                '}';
    }
}
