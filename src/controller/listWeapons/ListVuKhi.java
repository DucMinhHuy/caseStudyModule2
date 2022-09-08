package controller.listWeapons;

import java.util.ArrayList;

public class ListVuKhi {
    private ArrayList<MotaWeapon>list;
    public ListVuKhi(){
        this.list=new ArrayList<MotaWeapon>();
    }
    //1.them vu khi
    public void addVuKhi(MotaWeapon mt){
        this.list.add(mt);
    }
    //2.in ra
    public void inRa(){
        for (MotaWeapon m:list){
            System.out.println(m);
        }
    }
}
