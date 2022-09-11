package controller.interactive;
import model.hero.describe.HeroDescription;
import model.methods.*;
import model.weapon.describe.WeaponDescription;

public class HeroInteractionWeapon implements IAttackSpeed, IAttack, ICoolDownReduction, IHealPerSecondHp,IHealPerSecondMana,ILifeSteads,ICriticalChance,ICriticalDamage {
    private HeroDescription heroDescription=new HeroDescription();
    private WeaponDescription weaponDescription =new WeaponDescription();

    public HeroInteractionWeapon() {
    }


    public HeroInteractionWeapon(HeroDescription heroDescription, WeaponDescription weaponDescription) {
        this.heroDescription = heroDescription;
        this.weaponDescription = weaponDescription;
    }

    public boolean buy(){
        if(heroDescription.getMoney()>=weaponDescription.getMoney()){
            heroDescription.setMoney(heroDescription.getMoney()-weaponDescription.getMoney());
            return true;
        }else
            System.out.println("không đủ tiền, kiếm thêm đi .");
             return false;
    }

    @Override
    public int attack(int normalAttack, int baseDam) {
        if(buy()){
           return heroDescription.getAssassin().setBaseDamage(normalAttack+baseDam);
        }
           return heroDescription.getAssassin().setBaseDamage(normalAttack);

    }

    @Override
    public double attackSpeed(double AttackSpeedWeapon, double AttackSpeed) {
        if(buy()){
          return heroDescription.getAssassin().setAttackSpeed(AttackSpeedWeapon+AttackSpeedWeapon*AttackSpeed/100);

        }else{
           return heroDescription.getAssassin().setAttackSpeed(AttackSpeed);
        }
    }

    @Override
    public double coolDownReduction(double CoolDownReduction, double coolDownReductionWeapon) {
        if(buy()){
            return heroDescription.getAssassin().setCoolDownReduction(CoolDownReduction+CoolDownReduction+coolDownReductionWeapon/100);

        }else{
            return heroDescription.getAssassin().setCoolDownReduction(CoolDownReduction);
        }
    }

    @Override
    public double criticalChance(double Critical, double CriticalWeapon) {
        if(buy()){
            return heroDescription.getAssassin().setCriticalChance(Critical+Critical*CriticalWeapon/100);

        }else{
            return heroDescription.getAssassin().setCriticalChance(Critical);
        }
    }

    @Override
    public double criticalDamage(double CriticalDam, double criticalDam) {
        if(buy()){
            return heroDescription.getAssassin().setCriticalDamage(CriticalDam+CriticalDam+criticalDam/100);

        }else{
            return heroDescription.getAssassin().setCriticalDamage(CriticalDam);
        }
    }

    @Override
    public double healPerSecondHp(double HealPerSecondHp, double healPerSecondHp) {
        if(buy()){
            return heroDescription.getAssassin().setHealPerSecondHp(HealPerSecondHp+healPerSecondHp);

        }else{
            return heroDescription.getAssassin().setHealPerSecondHp(HealPerSecondHp);
        }
    }

    @Override
    public double healPerSecondMana(double HealPerSecondMana, double healPerSecondMana) {
        if(buy()){
            return heroDescription.getAssassin().setHealPerSecondMana(HealPerSecondMana+healPerSecondMana);

        }else{
            return heroDescription.getAssassin().setHealPerSecondMana(HealPerSecondMana);
        }
    }

    @Override
    public double lifeSteads(double LifeSteadsWeapon, double LifeSteads) {
        if(buy()){
            return heroDescription.getAssassin().setLifeSteal(LifeSteads+LifeSteads*LifeSteadsWeapon/100);

        }else{
            return heroDescription.getAssassin().setLifeSteal(LifeSteads);
        }
    }

    public HeroDescription getHeroDescription() {
        return heroDescription;
    }

    public void setHeroDescription(HeroDescription heroDescription) {
        this.heroDescription = heroDescription;
    }

    public WeaponDescription getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(WeaponDescription weaponDescription) {
        this.weaponDescription = weaponDescription;
    }
}
