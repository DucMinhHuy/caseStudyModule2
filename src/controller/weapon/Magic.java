package controller.weapon;

public class Magic extends Weapon{
    private int AbilityPower;// suc manh phep thuat
    private double Hp;
    private int Mana;
    private double MovementSpeed;//% di chuyen
    private double Armor;

    public Magic(String name, double CoolDownReduction, int abilityPower, double hp, int mana, double movementSpeed, double armor) {
        super(name, CoolDownReduction);
        AbilityPower = abilityPower;
        Hp = hp;
        Mana = mana;
        MovementSpeed = movementSpeed;
        Armor = armor;
    }

    public int getAbilityPower() {
        return AbilityPower;
    }

    public void setAbilityPower(int abilityPower) {
        AbilityPower = abilityPower;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public double getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public double getArmor() {
        return Armor;
    }

    public void setArmor(double armor) {
        Armor = armor;
    }
}
