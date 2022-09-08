package controller.heroName;
import controller.vukhi.Longinus;
import mordor.hero.Warrior;
import mordor.methods.*;
import controller.listWeapons.WeaponsDam;

import java.util.ArrayList;
import java.util.List;

public class Amily extends Warrior implements IMagicDefense,IAttackSpeed,ICoolDownReduction,IMovementSpeed, IAttack,ICriticalChance,ICriticalDamage,ILifeSteads,IHp{
    private static int money;

    private Warrior warrior = new Warrior();
    private static WeaponsDam weaponsDam=new WeaponsDam();
    public static List<WeaponsDam> WeaponDamList= new ArrayList<WeaponsDam>();
    @Override
    public int attack(int normalAttack) {
        if(buy()){
        int Dam=warrior.getBaseDamage();
        int result=Dam+normalAttack;
        return result;
        }else{
            return warrior.getBaseDamage();}
    }
    @Override
    public double attackSpeed(double AttackSpeedWeapon) {
        return 0;
    }

    private static boolean buy() {
//        for (int i = 0; i <= WeaponDamList.size(); i++) {
            int d=weaponsDam.getLonginus().getMoney();
            int d1=weaponsDam.getHolySword().getMoney();
            int listWeapon[]={d,d1};
            for(int j=0;j<=listWeapon.length;j++){
            if (money >=listWeapon[j]) {
                    return true;
                } else{
                    System.out.println("k du tien");
                }
            }
            return false;
//        }
//        return true;
    }

    @Override
    public double coolDownReduction(double CoolDownReduction) {
        return 0;
    }

    @Override
    public double criticalChance(double Critical) {
        return 0;
    }

    @Override
    public double criticalDamage(double CriticalDam) {
        return 0;
    }

    @Override
    public int hp(int Hp) {
        return 0;
    }

    @Override
    public double lifeSteads(double LifeSteadsWeapon) {
        return 0;
    }

    @Override
    public double MagicDefense(double MaGicDefense) {
        return 0;
    }

    @Override
    public double MovementSpeed(double movementSpeed) {
        return 0;
    }
    public Amily(String name, int birthDay, double height, int hp, int baseDamage, double coolDown, double armor, double magicDefense, int mana, double movementSpeed, double attackSpeed, double coolDownReduction, double healPerSecondMana, double healPerSecondHp, double money, double criticalChance, double criticalDamage, double lifeSteal) {
        super(name, birthDay, height, hp, baseDamage, coolDown, armor, magicDefense, mana, movementSpeed, attackSpeed, coolDownReduction, healPerSecondMana, healPerSecondHp, money, criticalChance, criticalDamage, lifeSteal);
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Amily.money = money;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public static WeaponsDam getWeaponsDam() {
        return weaponsDam;
    }

    public static void setWeaponsDam(WeaponsDam weaponsDam) {
        Amily.weaponsDam = weaponsDam;
    }


}
