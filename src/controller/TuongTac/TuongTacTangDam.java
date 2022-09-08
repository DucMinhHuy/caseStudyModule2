package controller.TuongTac;
import controller.heroName.MotaTuong;
import controller.listWeapons.MotaWeapon;

public class TuongTacTangDam {
    private MotaTuong motaTuong=new MotaTuong();
    private MotaWeapon motaWeapon=new MotaWeapon();
    public double attack(){
     return motaTuong.getCritical()+motaWeapon.getCri();
    }

}
