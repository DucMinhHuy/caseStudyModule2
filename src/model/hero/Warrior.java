package model.hero;

import model.Hero;

import java.io.Serializable;

public class Warrior extends Hero implements Serializable {
    private double CriticalChance=0;// ti le tri mang
    private double CriticalDamage=0;// sat thuong chi mang
    private double lifeSteal=0;//hut mau

    public Warrior(){

    }

    public Warrior(Object weapon, int id, String name, int birthDay, double height, int hitPoint, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double criticalChance, double criticalDamage, double lifeSteal) {
        super(weapon, id, name, birthDay, height, hitPoint, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        CriticalChance = criticalChance;
        CriticalDamage = criticalDamage;
        this.lifeSteal = lifeSteal;
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

    public double getLifeSteal() {
        return lifeSteal;
    }

    public void setLifeSteal(double lifeSteal) {
        this.lifeSteal = lifeSteal;
    }


    @Override
    public void buy(double money){
    }

    @Override
    public double add() {
        return 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +super.toString()+
                "CriticalChance=" + CriticalChance +
                ", CriticalDamage=" + CriticalDamage +
                ", lifeSteal=" + lifeSteal +
                '}';
    }
}
