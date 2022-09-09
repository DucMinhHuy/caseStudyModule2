package model;

import java.io.Serializable;

public abstract class Hero implements Serializable {
    private String Name;
    private int BirthDay;
    private double Height;
    private int HitPoint=0;
    private int BaseDamage=0;
    private double CoolDown=0;//hoi chieu
    private double Armor=0;
    private double MagicDefense=0;//khang phep
    private int Mana=0;
    private double MovementSpeed=0;// toc do di chuyen
    private double AttackSpeed=0;//toc do danh
    private double CoolDownReduction=0;//giam thoi gian hoi chieu
    private double HealPerSecondMana=0;
    private double HealPerSecondHp=0;
//    private double Money;
    public Hero(){};
    public abstract void buy(double money);
    public abstract double add();

    public Hero(String name, int birthDay, double height, int hitPoint, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp) {
        Name = name;
        BirthDay = birthDay;
        Height = height;
        HitPoint = hitPoint;
        BaseDamage = baseDamage;
        CoolDown = coolDown;
        Armor = armor;
        MagicDefense = magicDefense;
        Mana = mana;
        MovementSpeed = movementSpeed;
        AttackSpeed = attackSpeed;
        CoolDownReduction = coolDownReduction;
        HealPerSecondMana = healPerSecondMana;
        HealPerSecondHp = healPerSecondHp;
//        Money = money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(int birthDay) {
        BirthDay = birthDay;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public int getHitPoint() {
        return HitPoint;
    }

    public void setHitPoint(int hitPoint) {
        HitPoint = hitPoint;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }

    public int setBaseDamage(int baseDamage) {
        BaseDamage = baseDamage;
        return baseDamage;
    }

    public double getCoolDown() {
        return CoolDown;
    }

    public void setCoolDown(double coolDown) {
        CoolDown = coolDown;
    }

    public double getArmor() {
        return Armor;
    }

    public void setArmor(double armor) {
        Armor = armor;
    }

    public double getMagicDefense() {
        return MagicDefense;
    }

    public void setMagicDefense(double magicDefense) {
        MagicDefense = magicDefense;
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

    public double getAttackSpeed() {
        return AttackSpeed;
    }

    public double setAttackSpeed(double attackSpeed) {
        this.AttackSpeed = attackSpeed;
        return attackSpeed;
    }

    public double getCoolDownReduction() {
        return CoolDownReduction;
    }

    public void setCoolDownReduction(double coolDownReduction) {
        CoolDownReduction = coolDownReduction;
    }

    public double getHealPerSecondMana() {
        return HealPerSecondMana;
    }

    public void setHealPerSecondMana(double healPerSecondMana) {
        HealPerSecondMana = healPerSecondMana;
    }

    public double getHealPerSecondHp() {
        return HealPerSecondHp;
    }

    public void setHealPerSecondHp(double healPerSecondHp) {
        HealPerSecondHp = healPerSecondHp;
    }

//    public double getMoney() {
//        return Money;
//    }

//    public void setMoney(double money) {
//        Money = money;
//    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                ", BirthDay=" + BirthDay +
                ", Height=" + Height +
                ", HitPoint=" + HitPoint +
                ", BaseDamage=" + BaseDamage +
                ", CoolDown=" + CoolDown +
                ", Armor=" + Armor +
                ", MagicDefense=" + MagicDefense +
                ", Mana=" + Mana +
                ", MovementSpeed=" + MovementSpeed +
                ", AttackSpeed=" + AttackSpeed +
                ", CoolDownReduction=" + CoolDownReduction +
                ", HealPerSecondMana=" + HealPerSecondMana +
                ", HealPerSecondHp=" + HealPerSecondHp;
    }
}
