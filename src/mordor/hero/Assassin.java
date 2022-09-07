package mordor.hero;

import mordor.weapon.PhysicalAttack;

public class Assassin extends Hero{
    private PhysicalAttack physicalAttack;
    private double LifeSteal;//hut mau
    private double CriticalChance;//ti le tri mang
    private double CriticalDamage;// sat thuong tri mang
    public Assassin(){}

    @Override
    public double buy() {
        double result,result1;
        if(physicalAttack.getNormalAttack()==getBaseDamage()){
           result=getBaseDamage()+physicalAttack.getNormalAttack();
        }if(physicalAttack.getAttackSpeedWeapon()==getAttackSpeed()){
             result1=getBaseDamage()+getAttackSpeed();
        }
        return 0;
    }

    @Override
    public double add() {
        return 0;
    }

    ;
    public Assassin(String name, int birthDay, double height, double hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double lifeSteal, double criticalChance, double criticalDamage) {
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
}
