package view;

import controller.heroName.Amily;

public class Main {
    public static void main(String[] args) {
        Amily amily=new Amily("huy",12,169.9,3000,360,7,200,300,1000,365,34,6.2,50,50,3000,20,200,10);
//        System.out.println("attack :"+amily.attack(234));
        System.out.println("thong so :"+amily);
        System.out.println(amily.attack(234));
        System.out.println(amily.attackSpeed(23));

    }
}
