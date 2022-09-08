package controller.TuongTac;
import controller.heroName.MotaTuong;
import controller.listWeapons.MotaWeapon;

public class TuongTacTangDam {
    private MotaTuong motaTuong=new MotaTuong();
    private MotaWeapon motaWeapon=new MotaWeapon();
    public double attack(double Cri, double crit){
     return motaTuong.getCritical()+Cri +motaWeapon.getCri()+crit;
    }

}
