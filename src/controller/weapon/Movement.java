package controller.weapon;

public class Movement extends Weapon {
    //giay toc chay
    private double Armor;
    private double MagicDefensed; //khang phep
    private double MovementSpeed;//% di chuyen
    private int AbilityPower;
    private double AttackSpeep;// toc do danh

    public Movement(String name, double CoolDownReduction, double armor, double magicDefensed, double movementSpeed, int abilityPower, double attackSpeep) {
        super(name, CoolDownReduction);
        Armor = armor;
        MagicDefensed = magicDefensed;
        MovementSpeed = movementSpeed;
        AbilityPower = abilityPower;
        AttackSpeep = attackSpeep;
    }

    public double getArmor() {
        return Armor;
    }

    public void setArmor(double armor) {
        Armor = armor;
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
        return AbilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPower = abilityPower;
    }

    public double getAttackSpeep() {
        return AttackSpeep;
    }

    public void setAttackSpeep(double attackSpeep) {
        AttackSpeep = attackSpeep;
    }
}
