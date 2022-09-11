package model.weapon;

import model.Weapon;

import java.io.Serializable;

public class PhysicalAttack extends Weapon implements Serializable {
    private int NormalAttack=0;
    private double Hp=0;
    private double Critical=0;
    private double AttackSpeedWeapon=0;
    private double CriticalDam=0;
    private double LifeSteadsWeapon=0;
    public PhysicalAttack(){}

    public PhysicalAttack(int normalAttack, double hp, double critical, double attackSpeedWeapon, double criticalDam, double lifeSteadsWeapon) {
        NormalAttack = normalAttack;
        Hp = hp;
        Critical = critical;
        AttackSpeedWeapon = attackSpeedWeapon;
        CriticalDam = criticalDam;
        LifeSteadsWeapon = lifeSteadsWeapon;
    }

    public PhysicalAttack(String name, double coolDownReduction, int normalAttack, double hp, double critical, double attackSpeedWeapon, double criticalDam, double lifeSteadsWeapon) {
        super(name, coolDownReduction);
        NormalAttack = normalAttack;
        Hp = hp;
        Critical = critical;
        AttackSpeedWeapon = attackSpeedWeapon;
        CriticalDam = criticalDam;
        LifeSteadsWeapon = lifeSteadsWeapon;
    }

    public int getNormalAttack() {
        return NormalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        NormalAttack = normalAttack;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getCritical() {
        return Critical;
    }

    public void setCritical(double critical) {
        Critical = critical;
    }

    public double getAttackSpeedWeapon() {
        return AttackSpeedWeapon;
    }

    public void setAttackSpeedWeapon(double attackSpeedWeapon) {
        AttackSpeedWeapon = attackSpeedWeapon;
    }

    public double getCriticalDam() {
        return CriticalDam;
    }

    public void setCriticalDam(double criticalDam) {
        CriticalDam = criticalDam;
    }

    public double getLifeSteadsWeapon() {
        return LifeSteadsWeapon;
    }

    public void setLifeSteadsWeapon(double lifeSteadsWeapon) {
        LifeSteadsWeapon = lifeSteadsWeapon;
    }

    @Override
    public String toString() {
        return " Hp=" + Hp +
                ", Critical=" + Critical +
                ", AttackSpeedWeapon=" + AttackSpeedWeapon +
                ", CriticalDam=" + CriticalDam +
                ", LifeSteadsWeapon=" + LifeSteadsWeapon ;
    }
}
