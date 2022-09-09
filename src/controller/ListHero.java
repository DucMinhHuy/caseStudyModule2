package controller;

import controller.interactive.HeroInteractionWeapon;
import model.hero.describe.HeroDescription;

import java.util.ArrayList;

public class ListHero {
    private HeroInteractionWeapon hiw;
    private ArrayList<HeroDescription>listHero;
    public ListHero(){
        this.listHero=new ArrayList<HeroDescription>();
    }
    public void addHero(HeroDescription HD){
        this.listHero.add(HD);
    }
    public void printHero(){
        for(HeroDescription heroDescription:listHero){
            System.out.println(heroDescription);
        }
    }

//    public ListHero(HeroInteractionWeapon hiw) {
//        this.hiw = hiw;
//    }
//
//    public HeroInteractionWeapon getHiw() {
//        return hiw;
//    }
//
//    public void setHiw(HeroInteractionWeapon hiw) {
//        this.hiw = hiw;
//    }
}
