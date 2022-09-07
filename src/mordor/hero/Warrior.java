package mordor.hero;

public class Warrior extends Hero{
    private double CriticalChance;// ti le tri mang
    private double CriticalDamage;// sat thuong chi mang
    private double lifeSteal;//hut mau

    public Warrior(String name, int birthDay, double height, double hp, int baseDamage, int coolDown, int armor, int magicDefense, int mana, int movementSpeed, int attackSpeed, int coolDownReduction, int healPerSecondMana, int healPerSecondHp, double criticalChance, double criticalDamage, double lifeSteal) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp);
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
    public double buy() {
        return 0;
    }

    @Override
    public double add() {
        return 0;
    }
}
