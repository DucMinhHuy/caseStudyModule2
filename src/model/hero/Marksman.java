package model.hero;

import model.Hero;

import java.io.Serializable;

public class Marksman extends Hero implements Serializable {
    private double LifeSteal=0;//hut mau
    private double Acceleration=0;// toc chay
    private double ArmorPierce=0;// xuyen giap
    private double CriticalChance=0;//ti le tri mang
    private double CriticalDamage=0;// sat thuong tri mang

    public Marksman(){}

    @Override
    public void buy(double money) {
    }

    @Override
    public double add() {
        return 0;
    }

    public Marksman(Object weapon,int id,String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money, double lifeSteal, double acceleration, double armorPierce, double criticalChance, double criticalDamage) {
        super(weapon,id,name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        LifeSteal = lifeSteal;
        Acceleration = acceleration;
        ArmorPierce = armorPierce;
        CriticalChance = criticalChance;
        CriticalDamage = criticalDamage;
    }

    public double getLifeSteal() {
        return LifeSteal;
    }

    public void setLifeSteal(double lifeSteal) {
        LifeSteal = lifeSteal;
    }

    public double getAcceleration() {
        return Acceleration;
    }

    public void setAcceleration(double acceleration) {
        Acceleration = acceleration;
    }

    public double getArmorPierce() {
        return ArmorPierce;
    }

    public void setArmorPierce(double armorPierce) {
        ArmorPierce = armorPierce;
    }

    public double getCriticalChance() {
        return CriticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        CriticalChance = criticalChance;
    }

    public double getCriticalDamage() {
        return CriticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        CriticalDamage = criticalDamage;
    }

    @Override
    public String toString() {
        return "Marksman{" +super.toString()+
                "LifeSteal=" + LifeSteal +
                ", Acceleration=" + Acceleration +
                ", ArmorPierce=" + ArmorPierce +
                ", CriticalChance=" + CriticalChance +
                ", CriticalDamage=" + CriticalDamage +
                '}';
    }
}
