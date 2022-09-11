package model.hero;

import model.Hero;

import java.io.Serializable;

public class Tank extends Hero implements Serializable {
    public Tank(){}

    @Override
    public void buy(double money) {
    }


    @Override
    public double add() {
        return 0;
    }

    public Tank(Object weapon,int id, String name, int birthDay, double height, int hitPoint, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp) {
        super(weapon,id, name, birthDay, height, hitPoint, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
    }

    @Override
    public String toString() {
        return super.toString()+"Tank{}";
    }
}
