package controller;

import model.weapon.describe.WeaponDescription;
import storage.IGenericReadWriteData;
import storage.weapon.ReadWriteFileW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListWeapon {
    private static IGenericReadWriteData readWriteData= ReadWriteFileW.getInstance();
    private WeaponDescription weaponDescription;
    private List<WeaponDescription> listWeapon;

    public ListWeapon(){
        this.listWeapon=new ArrayList<WeaponDescription>();
    }
    public void addWeapon(WeaponDescription WD){
        this.listWeapon.add(WD);
        readWriteData.writeData(listWeapon);
    }
    public void PrintWeapon(){
        listWeapon=readWriteData.readData();
        for(WeaponDescription weaponDescription:listWeapon){
            System.out.println(weaponDescription);
        }
    }
    public boolean checkListWeapon(){
        return this.listWeapon.isEmpty();
    }
    public int getNumberListWeapon(){
        return this.listWeapon.size();
    }
    public void removeAllWeapon(){
        this.listWeapon.removeAll(listWeapon);
    }
    public boolean checkYesNoWeapon(WeaponDescription listWeapon){
        return this.listWeapon.contains(listWeapon);
    }
    public boolean removeWeapon(WeaponDescription weaponDescription){
        return this.listWeapon.remove(weaponDescription);
    }
    public void searchWeapon(String name){
        for(WeaponDescription weapon:listWeapon){
            if(weapon.getMovement().getName().indexOf(name)>=0) {
                System.out.println(weapon);
            }else {
                System.out.println("k thay");
            }
        }
    }
    public void sortWeapon(){
        Collections.sort(this.listWeapon, new Comparator<WeaponDescription>() {
            @Override
            public int compare(WeaponDescription o1, WeaponDescription o2) {
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
