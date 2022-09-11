package model.hero;

import model.Hero;

import java.io.Serializable;

public class Assassin extends Hero implements Serializable {
    private double LifeSteal=0;//hut mau
    private double CriticalChance=0;//ti le tri mang
    private double CriticalDamage=0;// sat thuong tri mang
    public Assassin(){}

    @Override
    public void buy(double money) {
    }

    @Override
    public double add() {
        return 0;
    }

    public Assassin(int id, String name, int birthDay, double height, int hitPoint, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double lifeSteal, double criticalChance, double criticalDamage) {
        super(id, name, birthDay, height, hitPoint, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        LifeSteal = lifeSteal;
        CriticalChance = criticalChance;
        CriticalDamage = criticalDamage;
    }

    public Assassin(Object weapon, int id, String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double lifeSteal, double criticalChance, double criticalDamage) {
        super(weapon,id,name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        LifeSteal = lifeSteal;
        CriticalChance = criticalChance;
        CriticalDamage = criticalDamage;
    }

    public double getLifeSteal() {
        return LifeSteal;
    }

    public double setLifeSteal(double lifeSteal) {
        LifeSteal = lifeSteal;
        return lifeSteal;
    }

    public double getCriticalChance() {
        return CriticalChance;
    }

    public double setCriticalChance(double criticalChance) {
        CriticalChance = criticalChance;
        return criticalChance;
    }

    public double getCriticalDamage() {
        return CriticalDamage;
    }

    public double setCriticalDamage(double criticalDamage) {
        CriticalDamage = criticalDamage;
        return criticalDamage;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", LifeSteal=" + LifeSteal +
                ", CriticalChance=" + CriticalChance +
                ", CriticalDamage=" + CriticalDamage;
    }
}
