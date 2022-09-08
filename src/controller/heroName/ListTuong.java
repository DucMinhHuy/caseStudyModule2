package controller.heroName;

import java.util.ArrayList;

public class ListTuong {
    private ArrayList<MotaTuong>listTuong;
    public ListTuong(){
        this.listTuong=new ArrayList<MotaTuong>();
    }
    //1.them tuong
    public void addTuong(MotaTuong mt){
        this.listTuong.add(mt);
    }
    public void inTuong(){
        for(MotaTuong lt:listTuong){
            System.out.println(lt);
        }
    }
}
