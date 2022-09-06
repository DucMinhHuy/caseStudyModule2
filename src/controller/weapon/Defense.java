package controller.weapon;

public class Defense extends Weapon{
    private double Armor;
    private double Hp;
    private double HealPerSecond;//hoi tren giay
    private int Mana;
    private double MagicDefensed;// khang phep

    public Defense(String name, double CoolDownReduction, double armor, double hp, double healPerSecond, int mana, double magicDefensed) {
        super(name, CoolDownReduction);
        Armor = armor;
        Hp = hp;
        HealPerSecond = healPerSecond;
        Mana = mana;
        MagicDefensed = magicDefensed;
    }

    public double getArmor() {
        return Armor;
    }

    public void setArmor(double armor) {
        Armor = armor;
    }

    public double getHp() {
        return Hp;
    }

    public void setHp(double hp) {
        Hp = hp;
    }

    public double getHealPerSecond() {
        return HealPerSecond;
    }

    public void setHealPerSecond(double healPerSecond) {
        HealPerSecond = healPerSecond;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public double getMagicDefense() {
        return MagicDefensed;
    }

    public void setMagicDefense(double magicDefense) {
        MagicDefensed = magicDefense;
    }
}
