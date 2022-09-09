package controller;

import controller.interactive.HeroInteractionWeapon;
import model.hero.describe.HeroDescription;
import storage.IGenericReadWriteData;
import storage.hero.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;

public class ListHero {
    private static IGenericReadWriteData readWriteData = ReadWriteFile.getInstance();
    private HeroInteractionWeapon hiw;
    private List<HeroDescription> listHero;
    public ListHero(){
        this.listHero=new ArrayList<HeroDescription>();
    }
    public void addHero(HeroDescription HD){
        listHero=readWriteData.readData();
        listHero.add(HD);
        readWriteData.writeData(listHero);
    }
    public void printHero(){
        listHero=readWriteData.readData();
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
