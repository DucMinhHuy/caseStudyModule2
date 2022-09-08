package mordor.weapon;

public class PhysicalAttack extends Weapon{
    private int NormalAttack;
    private double Hp;
    private double Critical;
    private double AttackSpeedWeapon;
    private double CriticalDam;
    private double LifeSteadsWeapon;

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
        return "PhysicalAttack{" +super.toString()+
                "NormalAttack=" + NormalAttack +
                ", Hp=" + Hp +
                ", Critical=" + Critical +
                ", AttackSpeedWeapon=" + AttackSpeedWeapon +
                ", CriticalDam=" + CriticalDam +
                ", LifeSteadsWeapon=" + LifeSteadsWeapon +
                '}';
    }
}
