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
        double cri = 0;
        double crit = 0;

        do {
            System.out.println("1: listvukhi");
            System.out.println("2: listtuong");
            System.out.println("3: tuong co vu khi");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    do {
                        System.out.println("1.nhap thong tin tuong");
                        System.out.println("2. in ra");
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("nhap :");
                                String name = sc.nextLine();
                                System.out.println("nhap :");
                                int base = sc.nextInt();
                                System.out.println("nhap :");
                                 cri = sc.nextInt();
                                MotaTuong mt = new MotaTuong(name, base, cri);
                                listTuong.addTuong(mt);
                                break;
                            case 2:
                                listTuong.inTuong();
                                break;
                        }
                    }while (chose!=0);
                        break;
                case 2:
                    do {
                        System.out.println("1.nhap thong vu khi");
                        System.out.println("2. in ra");
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("nhap :");
                                String na = sc.nextLine();
                                System.out.println("nhap :");
                                int ba = sc.nextInt();
                                System.out.println("nhap :");
                                 crit = sc.nextInt();
                                MotaWeapon mt1 = new MotaWeapon(na, ba, crit);
                                listVuKhi.addVuKhi(mt1);
                                break;
                            case 2:
                                listVuKhi.inRa();
                                break;
                        }
                    }while (chose!=0);
                    break;
                case 3:
                    System.out.println(t.attack(cri,crit));
                    break;
            }
        }while (luachon!=0);
    }
}
