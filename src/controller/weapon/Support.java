package controller.weapon;

public class Support extends Weapon{
    private double Hp;
    private double MovementSpeed;// % di chuyen
    private int AbilityMagic;
    private int NormalAttack;//cong vat ly

    public Support(String name, double CoolDownReduction, double hp, double movementSpeed, int abilityMagic, int normalAttack) {
        super(name, CoolDownReduction);
        Hp = hp;
        MovementSpeed = movementSpeed;
        AbilityMagic = abilityMagic;
        NormalAttack = normalAttack;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public int getAbilityMagic() {
        return AbilityMagic;
    }

    public void setAbilityMagic(int abilityMagic) {
        AbilityMagic = abilityMagic;
    }

    public int getNormalAttack() {
        return NormalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        NormalAttack = normalAttack;
    }
}
