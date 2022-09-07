package controller.weapon;

public class Support extends Weapon{
    private double Hp;
    private double MovementSpeed;// % di chuyen
    private int AbilityPowerWeapon;
    private int NormalAttack;//cong vat ly

    public Support(String name, double coolDownReduction, double hp, double movementSpeed, int abilityPowerWeapon, int normalAttack) {
        super(name, coolDownReduction);
        Hp = hp;
        MovementSpeed = movementSpeed;
        AbilityPowerWeapon = abilityPowerWeapon;
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
        return AbilityPowerWeapon;
    }

    public void setAbilityMagic(int abilityMagic) {
        AbilityPowerWeapon = abilityMagic;
    }

    public int getNormalAttack() {
        return NormalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        NormalAttack = normalAttack;
    }
}
