package model.hero;

import model.Hero;
import model.weapon.PhysicalAttack;

public class Assassin extends Hero {
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

    public Assassin(String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double lifeSteal, double criticalChance, double criticalDamage) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        LifeSteal = lifeSteal;
        CriticalChance = criticalChance;
        CriticalDamage = criticalDamage;
    }

    public double getLifeSteal() {
        return LifeSteal;
    }

    public void setLifeSteal(double lifeSteal) {
        LifeSteal = lifeSteal;
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
        return  super.toString()+
                ", LifeSteal=" + LifeSteal +
                ", CriticalChance=" + CriticalChance +
                ", CriticalDamage=" + CriticalDamage;
    }
}
