package model.hero.describe;

import model.hero.Assassin;
import model.weapon.describe.WeaponDescription;

import java.io.Serializable;
import java.util.Objects;

public class HeroDescription implements Serializable,Comparable<HeroDescription> {

    private Assassin assassin=new Assassin();
    private int money;
    public  HeroDescription(int nameHero){}
    public HeroDescription(){}

//public HeroDescription(Assassin assassin){
//        this.assassin=assassin;
//}
    public HeroDescription(Assassin assassin, int money) {
        this.assassin = assassin;
        this.money = money;
    }

    public Assassin getAssassin() {
        return assassin;
    }

    public void setAssassin(Assassin assassin) {
        this.assassin = assassin;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "HeroDescription{" + assassin +
                ", money=" + money +
                '}';
    }

    @Override
    public int compareTo(HeroDescription o) {
        return this.money-(o.money);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroDescription that = (HeroDescription) o;
//        return money == that.money;
        return Objects.equals(money,that.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assassin, money);
    }
}
