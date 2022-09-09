package view;
import controller.ListHero;
import controller.ListWeapon;
import controller.interactive.HeroInteractionWeapon;
import model.Hero;
import model.hero.Assassin;
import model.hero.describe.HeroDescription;
import model.weapon.Movement;
import model.weapon.PhysicalAttack;
import model.weapon.describe.WeaponDescription;
import java.util.Scanner;

public class MainPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListHero listHero=new ListHero();
        ListWeapon listWeapon=new ListWeapon();
        HeroInteractionWeapon heroInteractionWeapon=new HeroInteractionWeapon();
        int luachon = 0;
        int chose = 0;
        int baseDamage  = 0;
        int abilityPower = 0;
        int baseDamage1=0;
        double attackSpeed = 0;
        double attackSpeed1 = 0;
        do {
            System.out.println("1: danh sách tướng và thông số");
            System.out.println("2: danh sách vũ khí và thông số");
            System.out.println("3: thông sô tướng có vũ khí");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    do {
                        System.out.println("1.nhập thông tin tướng");
                        System.out.println("2. in ra");
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("nhap name :");
                                String name = sc.nextLine();
                                System.out.println("nhap birthDay : ");
                                int birthday =sc.nextInt();
                                System.out.println("nhap height :");
                                double height =sc.nextDouble();
                                System.out.println("nhap hp :");
                                int hp=sc.nextInt();
                                System.out.println("nhap baseDam :");
                                baseDamage=sc.nextInt();
                                System.out.println("nhap coolDown :");
                                double coolDown=sc.nextDouble();
                                System.out.println("nhap armor : ");
                                double armor=sc.nextInt();
                                System.out.println("nhap magicDefense : ");
                                double magicDefense=sc.nextDouble();
                                System.out.println("nhap mana :");
                                int mana=sc.nextInt();
                                System.out.println("nhap movementSpeed : ");
                                double movementSpeed=sc.nextDouble();
                                System.out.println("nhap attackSpeed :");
                                attackSpeed=sc.nextDouble();
                                System.out.println("nhap coolDownReduction :");
                                double coolDownReduction=sc.nextDouble();
                                System.out.println("nhap healPerSecondMana :");
                                double healPerSecondMana=sc.nextDouble();
                                System.out.println("nhap healPerSecondHp :");
                                double healPerSecondHp=sc.nextDouble();
                                System.out.println("nhap money :");
                                int money = sc.nextInt();
                                System.out.println("nhap lifeSteal :");
                                double lifeSteal=sc.nextDouble();
                                System.out.println("nhap criticalDamage :");
                                double criticalDamage=sc.nextDouble();
                                System.out.println("nhap criticalChance :");
                                double criticalChance=sc.nextDouble();
                                Assassin assassin=new Assassin(name,birthday,height,hp,baseDamage,coolDown,armor,magicDefense,mana,movementSpeed,attackSpeed,coolDownReduction,healPerSecondMana,healPerSecondHp,lifeSteal,criticalChance,criticalDamage);
                                HeroDescription info= new HeroDescription(assassin,money);
                                listHero.addHero(info);
                                break;
                            case 2:
                                listHero.printHero();
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
                                System.out.println("nhap name :");
                                String name = sc.nextLine();
                                System.out.println("nhap hp :");
                                int hp=sc.nextInt();
                                System.out.println("nhap baseDam :");
                                abilityPower=sc.nextInt();
                                System.out.println("nhap armor : ");
                                double armor=sc.nextInt();
                                System.out.println("nhap magicDefense : ");
                                double magicDefense=sc.nextDouble();
                                System.out.println("nhap movementSpeed : ");
                                double movementSpeed=sc.nextDouble();
                                System.out.println("nhap attackSpeed :");
                                attackSpeed1=sc.nextDouble();
                                System.out.println("nhap coolDownReduction :");
                                double coolDownReduction=sc.nextDouble();
                                System.out.println("nhap money :");
                                int money = sc.nextInt();
                                System.out.println("nhap lifeSteal :");
                                double lifeSteal=sc.nextDouble();
                                System.out.println("nhap criticalDamage :");
                                double criticalDamage=sc.nextDouble();
                                System.out.println("nhap baseDam :");
                                baseDamage1=sc.nextInt();
                                System.out.println("nhap criticalChance :");
                                double criticalChance=sc.nextDouble();
                                Movement movement=new Movement(name,coolDownReduction,armor,magicDefense,movementSpeed,abilityPower,attackSpeed1);
                                PhysicalAttack physicalAttack= new PhysicalAttack(baseDamage1,hp,criticalChance,attackSpeed1,criticalDamage,lifeSteal) ;
                                WeaponDescription weaponDescription=new WeaponDescription(physicalAttack,movement,money);
                                listWeapon.addWeapon(weaponDescription);
                                break;
                            case 2:
                                listWeapon.PrintWeapon();
                                break;
                        }
                    }while (chose!=0);
                    break;
                case 3:
                    System.out.println(heroInteractionWeapon.attackSpeed(attackSpeed1,attackSpeed));
                    System.out.println(heroInteractionWeapon.attack(baseDamage,baseDamage1));
                    break;
            }
        }while (luachon!=0);
    }
}
