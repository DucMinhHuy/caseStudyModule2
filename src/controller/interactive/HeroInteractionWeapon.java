package controller.interactive;
import controller.ListHero;
import model.hero.Assassin;
import model.hero.describe.HeroDescription;
import model.methods.*;
import model.weapon.Movement;
import model.weapon.PhysicalAttack;
import model.weapon.describe.WeaponDescription;

public class HeroInteractionWeapon implements IAttackSpeed, IAttack, ICoolDownReduction, IHealPerSecondHp,IHealPerSecondMana,ILifeSteads,ICriticalChance,ICriticalDamage {
    private HeroDescription heroDescription =new HeroDescription(new Assassin(),0);
    private WeaponDescription weaponDescription=new WeaponDescription(new PhysicalAttack(),new Movement(),0);
    private ListHero listHero=new ListHero();

    public boolean buy(int Money,int money){
        if(heroDescription.getMoney()+Money>=weaponDescription.getMoney()+money){
            return true;
        }else System.out.println("không đủ tiền, kiếm thêm đi .");
        return false;
    }

    @Override
    public int attack(int normalAttack, int baseDam) {
        if(buy(heroDescription.getMoney(),weaponDescription.getMoney())){
            return heroDescription.getAssassin().setBaseDamage(normalAttack+baseDam);
        }else {
           return heroDescription.getAssassin().setBaseDamage(baseDam);
        }
    }

    @Override
    public double attackSpeed(double AttackSpeedWeapon, double AttackSpeed) {
        if(buy(heroDescription.getMoney(),weaponDescription.getMoney())){
          return heroDescription.getAssassin().setAttackSpeed(AttackSpeed+AttackSpeedWeapon);

        }else{
           return heroDescription.getAssassin().setAttackSpeed(AttackSpeed);
        }
    }

    @Override
    public double coolDownReduction(double CoolDownReduction, double coolDownReductionWeapon) {
return 0;
    }

    @Override
    public double criticalChance(double Critical, double CriticalWeapon) {
return 0;
    }

    @Override
    public double criticalDamage(double CriticalDam, double criticalDam) {
return 0;
    }

    @Override
    public double healPerSecondHp(double HealPerSecondHp, double healPerSecondHp) {
        return 0;
    }

    @Override
    public double healPerSecondMana(double HealPerSecondMana, double healPerSecondMana) {
return 0;
    }

    @Override
    public double lifeSteads(double LifeSteadsWeapon, double LifeSteads) {
return 0;
    }
}
