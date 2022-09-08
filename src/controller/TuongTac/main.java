package controller.TuongTac;

import controller.heroName.ListTuong;
import controller.heroName.MotaTuong;
import controller.listWeapons.ListVuKhi;
import controller.listWeapons.MotaWeapon;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListTuong listTuong = new ListTuong();
        ListVuKhi listVuKhi = new ListVuKhi();
        TuongTacTangDam t = new TuongTacTangDam();
        int luachon = 0;
        int chose = 0;
        chose = sc.nextInt();
        luachon = sc.nextInt();
        do {
            System.out.println("1: listvukhi");
            System.out.println("2: listtuong");
            System.out.println("3: tuong co vu khi");
            switch (luachon) {
                case 1:{
                    switch (chose) {
                case 1:
                    sc.nextLine();
                    System.out.println("nhap :");
                    String name = sc.nextLine();
                    System.out.println("nhap :");
                    int base = sc.nextInt();
                    System.out.println("nhap :");
                    double cri = sc.nextInt();
                    MotaTuong mt = new MotaTuong(name, base, cri);
                    listTuong.addTuong(mt);
                    break;
                    case 2:
                        listTuong.inTuong();
                        break;
                }
            }
            break;
                case 2:{
                    switch (chose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("nhap :");
                                String name = sc.nextLine();
                                System.out.println("nhap :");
                                int base = sc.nextInt();
                                System.out.println("nhap :");
                                double cri = sc.nextInt();
                                MotaWeapon mt1 = new MotaWeapon(name, base, cri);
                                listVuKhi.addVuKhi(mt1);
                                break;
                            case 2:
                                listVuKhi.inRa();
                                break;
                        }
                    }
                case 3:
                    t.attack();

            }
        } while (luachon != 0);
    }
}
