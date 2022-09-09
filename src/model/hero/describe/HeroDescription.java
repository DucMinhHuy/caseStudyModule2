package model.hero.describe;

import model.hero.Assassin;

import java.io.Serializable;

public class HeroDescription implements Serializable {
    private Assassin assassin;
    private static int money=0;
    public HeroDescription(){}

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
}
