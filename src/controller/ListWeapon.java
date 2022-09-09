package controller;

import model.weapon.describe.WeaponDescription;

import java.util.ArrayList;

public class ListWeapon {
    private WeaponDescription weaponDescription;
    private ArrayList<WeaponDescription>listWeapon;
    public ListWeapon(){
        this.listWeapon=new ArrayList<WeaponDescription>();
    }
    public void addWeapon(WeaponDescription WD){
        this.listWeapon.add(WD);

    }
    public void PrintWeapon(){
        for(WeaponDescription weaponDescription:listWeapon){
            System.out.println(weaponDescription);
        }
    }
}
