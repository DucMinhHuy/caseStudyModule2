package controller.hero;

public class Marksman extends Hero{
    private double LifeSteal;//hut mau
    private double Acceleration;// toc chay
    private double ArmorPierce;// xuyen giap
    private double CriticalChance;//ti le tri mang
    private double CriticalDamage;// sat thuong tri mang

    public Marksman(){}

    @Override
    public double buy(double money) {
        return 0;
    }

    @Override
    public double add() {
        return 0;
    }

    public Marksman(String name, int birthDay, double height, double hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money, double lifeSteal, double acceleration, double armorPierce, double criticalChance, double criticalDamage) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp, money);
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
}
