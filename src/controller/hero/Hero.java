package controller.hero;

public abstract class Hero {
    private String Name;
    private int BirthDay;
    private double Height;
    private double HitPoint;
    private int BaseDamage=360;
    private double CoolDown;//hoi chieu
    private double Armor;
    private double MagicDefense;//khang phep
    private int Mana;
    private double MovementSpeed=365.5;// toc do di chuyen
    private double AttackSpeed;//toc do danh
    private double CoolDownReduction=6;//giam thoi gian hoi chieu
    private double HealPerSecondMana;
    private double HealPerSecondHp;
    private double Money;
    public Hero(){};
    public abstract double buy(double money);
    public abstract double add();

    public Hero(String name, int birthDay, double height, double hitPoint, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money) {
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
        Money = money;
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

    public double getHitPoint() {
        return HitPoint;
    }

    public void setHitPoint(double hitPoint) {
        HitPoint = hitPoint;
    }

    public int getBaseDamage() {
        return BaseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        BaseDamage = baseDamage;
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

    public void setAttackSpeed(double attackSpeed) {
        AttackSpeed = attackSpeed;
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

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        Money = money;
    }
}
