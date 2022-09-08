package mordor.hero;

import mordor.weapon.PhysicalAttack;

public class Assassin extends Hero{
    private PhysicalAttack physicalAttack;
    private double LifeSteal;//hut mau
    private double CriticalChance;//ti le tri mang
    private double CriticalDamage;// sat thuong tri mang
    public Assassin(){}

    @Override
    public void buy(double money) {
    }

    @Override
    public double add() {
        return 0;
    }

    public Assassin(String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money, PhysicalAttack physicalAttack, double lifeSteal, double criticalChance, double criticalDamage) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
        this.physicalAttack = physicalAttack;
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
        return "Assassin{" +super.toString()+
                "physicalAttack=" + physicalAttack +
                ", LifeSteal=" + LifeSteal +
                ", CriticalChance=" + CriticalChance +
                ", CriticalDamage=" + CriticalDamage +
                '}';
    }
}
