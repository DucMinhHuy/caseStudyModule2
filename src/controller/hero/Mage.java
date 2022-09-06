package controller.hero;

public class Mage extends Hero{
    private int AbilityPower;// phep
    private double MagicPierce;//xuyen giap phep
    private double MagicLifeSteal;// hut mau phep
    public Mage(){};
    public Mage(String name, int birthDay, double height, double hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, int abilityPower, double magicPierce, double magicLifeSteal) {
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
}
