package controller.hero.heroName;

import controller.hero.Warrior;
import controller.methods.*;
import mordor.weapons.Longinus;

public class Amily implements IMagicDefense,IAttackSpeed,ICoolDownReduction,IMovementSpeed, IAttack,ICriticalChance,ICriticalDamage,ILifeSteads,IHp{
    private Warrior warrior = new Warrior();
    private Longinus longinus;
    @Override
    public int attack(int normalAttack) {
        int r=warrior.getBaseDamage();
        int result=r+normalAttack;
        return result;
    }

    @Override
    public double attackSpeed(double AttackSpeed, double AttackSpeedWeapon) {
        return 0;
    }

    @Override
    public double coolDownReduction(double CoolDownReduction) {
        return 0;
    }

    @Override
    public double criticalChance(double CriticalChance, double Critical) {
        return 0;
    }

    @Override
    public double criticalDamage(double CriticalDamage, double CriticalDam) {
        return 0;
    }

    @Override
    public int hp(int HitPoint, int Hp) {
        return 0;
    }

    @Override
    public double lifeSteads(double LifeSteads, double LifeSteadsWeapon) {
        return 0;
    }

    @Override
    public double MagicDefense(double MaGicDefensed, double MaGicDefense) {
        return 0;
    }

    @Override
    public double MovementSpeed(double movementSpeed) {
        return 0;
    }
}
