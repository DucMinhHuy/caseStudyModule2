package controller.weapon;

public class PhysicalAttack extends Weapon{
    private int NormalAttack;
    private double Hp;
    private double Critical;
    private double AttackSpeel;
    private double CriticalDam;

    public PhysicalAttack(String name, double CoolDownReduction, int normalAttack, double hp, double critical, double attackSpeel, double criticalDam) {
        super(name, CoolDownReduction);
        NormalAttack = normalAttack;
        Hp = hp;
        Critical = critical;
        AttackSpeel = attackSpeel;
        CriticalDam = criticalDam;
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

    public double getAttackSpeel() {
        return AttackSpeel;
    }

    public void setAttackSpeel(double attackSpeel) {
        AttackSpeel = attackSpeel;
    }

    public double getCriticalDam() {
        return CriticalDam;
    }

    public void setCriticalDam(double criticalDam) {
        CriticalDam = criticalDam;
    }
}
