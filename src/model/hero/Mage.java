package model.hero;

import model.Hero;

public class Mage extends Hero {
    private int AbilityPower=0;// phep
    private double MagicPierce=0;//xuyen giap phep
    private double MagicLifeSteal=0;// hut mau phep
    public Mage(){}

    @Override
    public void buy(double money) {
    }


    @Override
    public double add() {
        return 0;
    }

    public Mage(String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money, int abilityPower, double magicPierce, double magicLifeSteal) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        AbilityPower = abilityPower;
        MagicPierce = magicPierce;
        MagicLifeSteal = magicLifeSteal;
    }

    public int getAbilityPower() {
        return AbilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPower = abilityPower;
    }

    public double getMagicPierce() {
        return MagicPierce;
    }

    public void setMagicPierce(double magicPierce) {
        MagicPierce = magicPierce;
    }

    public double getMagicLifeSteal() {
        return MagicLifeSteal;
    }

    public void setMagicLifeSteal(double magicLifeSteal) {
        MagicLifeSteal = magicLifeSteal;
    }

    @Override
    public String toString() {
        return "Mage{" +super.toString()+
                "AbilityPower=" + AbilityPower +
                ", MagicPierce=" + MagicPierce +
                ", MagicLifeSteal=" + MagicLifeSteal +
                '}';
    }
}
