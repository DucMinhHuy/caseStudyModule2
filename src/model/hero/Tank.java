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

    public Tank(String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
    }

    @Override
    public String toString() {
        return super.toString()+"Tank{}";
    }
}
