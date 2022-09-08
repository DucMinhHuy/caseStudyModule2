package model.weapon;

public class Movement extends Weapon {
    //giay toc chay
    private double ArmorWeapon;
    private double MagicDefensed; //khang phep
    private double MovementSpeed;//% di chuyen
    private int AbilityPowerWeapon;
    private double AttackSpeedWeapon;// toc do danh

    public Movement(String name, double coolDownReduction, double armorWeapon, double magicDefensed, double movementSpeed, int abilityPowerWeapon, double attackSpeedWeapon) {
        super(name, coolDownReduction);
        ArmorWeapon = armorWeapon;
        MagicDefensed = magicDefensed;
        MovementSpeed = movementSpeed;
        AbilityPowerWeapon = abilityPowerWeapon;
        AttackSpeedWeapon = attackSpeedWeapon;
    }

    public double getArmor() {
        return ArmorWeapon;
    }

    public void setArmor(double armor) {
        ArmorWeapon = armor;
    }

    public double getMagicDefense() {
        return MagicDefensed;
    }

    public void setMagicDefense(double magicDefense) {
        MagicDefensed = magicDefense;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public int getAbilityPower() {
        return AbilityPowerWeapon;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPowerWeapon = abilityPower;
    }

    public double getAttackSpeep() {
        return AttackSpeedWeapon;
    }

    public void setAttackSpeep(double attackSpeep) {
        AttackSpeedWeapon = attackSpeep;
    }

    @Override
    public String toString() {
        return "Movement{" +super.toString()+
                "ArmorWeapon=" + ArmorWeapon +
                ", MagicDefensed=" + MagicDefensed +
                ", MovementSpeed=" + MovementSpeed +
                ", AbilityPowerWeapon=" + AbilityPowerWeapon +
                ", AttackSpeedWeapon=" + AttackSpeedWeapon +
                '}';
    }
}
