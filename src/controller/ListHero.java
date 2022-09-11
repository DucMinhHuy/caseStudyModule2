package controller;

import controller.interactive.HeroInteractionWeapon;
import model.hero.describe.HeroDescription;
import storage.IGenericReadWriteData;
import storage.hero.ReadWriteFile;

import java.util.*;

public class ListHero {
    private static IGenericReadWriteData readWriteData = ReadWriteFile.getInstance();
    private HeroInteractionWeapon hiw;
    private List<HeroDescription> listHero;
    public ListHero(){
        this.listHero=new ArrayList<HeroDescription>();
    }
    public void addHero(HeroDescription HD){
//        listHero=readWriteData.readData();
        listHero.add(HD);
        readWriteData.writeData(listHero);
    }
    public void printHero(){
        listHero=readWriteData.readData();
        for(HeroDescription heroDescription:listHero){
            System.out.println(heroDescription);
        }
    }
    public boolean checkList(){
        return this.listHero.isEmpty();
    }
    public int getNumberList(){
        return this.listHero.size();
    }
    public void removeAll(){
        this.listHero.removeAll(listHero);
    }
    public boolean checkYesNo(HeroDescription listHero){
        return this.listHero.contains(listHero);
    }
    public boolean remove(HeroDescription listHero){
        return this.listHero.remove(listHero);
    }
    public void search(String name){
        for(HeroDescription heroDescription:listHero){
            if(heroDescription.getAssassin().getName().indexOf(name)>=0){
                System.out.println(heroDescription);
            }else {
                System.out.println("khong thay");
            }
        }
    }
    public void sort(){
        Collections.sort(this.listHero, new Comparator<HeroDescription>() {
            @Override
            public int compare(HeroDescription o1, HeroDescription o2) {
                if(o1.getMoney()<o2.getMoney()){
                    return 1;
                }else if(o1.getMoney()>o2.getMoney()){
                    return -1;
                }
                return 0;
            }
        });
    }

}
