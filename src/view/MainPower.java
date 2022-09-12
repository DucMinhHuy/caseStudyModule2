package view;
import controller.ListHero;
import controller.ListWeapon;
import controller.interactive.HeroInteractionWeapon;
import model.hero.Assassin;
import model.hero.describe.HeroDescription;
import model.weapon.Movement;
import model.weapon.PhysicalAttack;
import model.weapon.describe.WeaponDescription;
import java.util.Scanner;

public class MainPower {
    public static void main(String[] args) {
        HeroDescription info=null;
        WeaponDescription weaponDescription = null;
        Scanner sc = new Scanner(System.in);
        ListHero listHero=new ListHero();
        ListWeapon listWeapon=new ListWeapon();
        HeroInteractionWeapon heroInteractionWeapon = new HeroInteractionWeapon(info,weaponDescription);
        int luachon,money,money1;
        int chose;
        int baseDamage  = 0;
        int abilityPower = 0;
        int baseDamage1=0;
        double attackSpeed = 0,criticalChance=0,criticalChance1=0,criticalDamage1=0,criticalDamage=0,lifeSteal=0;
        double attackSpeed1 = 0,coolDownReduction=0,coolDownReduction1=0,healPerSecondHp=0,healPerSecondMana=0,lifeSteal1=0;
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
                        System.out.println("3.kiểm tra danh sách tướng");
                        System.out.println("4.sô lượng tướng hiện tại");
                        System.out.println("5.xoá hết tướng");
                        System.out.println("6 kiểm tra tướng này có trong listHero không");
                        System.out.println("7.tướng phế quá xoá đi");
                        System.out.println("8. tìm hero");
                        System.out.println("9.tướng nào gìau nhất ");
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                System.out.println("nhap id :");
                                int id=sc.nextInt();sc.nextLine();
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
                                coolDownReduction1=sc.nextDouble();
                                System.out.println("nhap healPerSecondMana :");
                                healPerSecondMana=sc.nextDouble();
                                System.out.println("nhap healPerSecondHp :");
                                healPerSecondHp=sc.nextDouble();
                                System.out.println("nhap money :");
                                money = sc.nextInt();
                                System.out.println("nhap lifeSteal :");
                                lifeSteal=sc.nextDouble();
                                System.out.println("nhap criticalDamage :");
                                criticalDamage=sc.nextDouble();
                                System.out.println("nhap criticalChance :");
                                criticalChance1=sc.nextDouble();
                                Assassin assassin=new Assassin(id,name,birthday,height,hp,baseDamage,coolDown,armor,magicDefense,mana,movementSpeed,attackSpeed,coolDownReduction1,healPerSecondMana,healPerSecondHp,lifeSteal,criticalChance1,criticalDamage);
                                info= new HeroDescription(assassin,money);
                                listHero.addHero(info);
                                break;
                            case 2:
                                listHero.printHero();
                                break;
                            case 3:
                                System.out.println("danh sách có rỗng hay không :" +listHero.checkList());
                                break;
                            case 4:
                                System.out.println(" số lượng hiện tại :"+listHero.getNumberList());
                                break;
                            case 5:
                                listHero.removeAll();
                                break;
                            case 6:
                                System.out.println(" nhập id tướng :");int id2=sc.nextInt();
                                HeroDescription heroDescription=new HeroDescription(id2);
                                System.out.println("kiểm tra tướng có trong lístHero :"+listHero.checkYesNo(heroDescription));
                                break;
                            case 7:
                                System.out.println("nhập id tướng :");int idtuong=sc.nextInt();
                                HeroDescription heroDescription1=new HeroDescription(idtuong);
                                System.out.println("tướng hiện tướng đã xoá :"+listHero.remove(heroDescription1));
                                break;
                            case 8:
                                System.out.println("nhập tên :");sc.nextLine();String nameHero2=sc.nextLine();
                                System.out.println("kết quả tìm kiếm :");
                                listHero.search(nameHero2);
                                break;
                            case 9:
                                System.out.println("sắp xếp theo money của tướng :");
                                listHero.sort();
                                break;
                        }
                    }while (chose!=0);
                    break;
                case 2:
                    do {
                        System.out.println("1.nhập thông tin vũ khí");
                        System.out.println("2. in ra");
                        System.out.println("3.kiểm tra danh sách vũ khí");
                        System.out.println("4.sô lượng vũ khí hiện tại");
                        System.out.println("5.xoá hết vũ khí");
                        System.out.println("6 kiểm tra vũ khí này có trong listWeapon không");
                        System.out.println("7.vũ khí phế quá xoá đi");
                        System.out.println("8. tìm vũ khí");
                        System.out.println("9.vũ khí nào đắt nhất ");
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                sc.nextLine();
                                System.out.println("nhap name :");
                                String name = sc.nextLine();
                                System.out.println("nhap hp :");
                                int hp = sc.nextInt();
                                System.out.println("nhap baseDam :");
                                abilityPower = sc.nextInt();
                                System.out.println("nhap armor : ");
                                double armor = sc.nextInt();
                                System.out.println("nhap magicDefense : ");
                                double magicDefense = sc.nextDouble();
                                System.out.println("nhap movementSpeed : ");
                                double movementSpeed = sc.nextDouble();
                                System.out.println("nhap attackSpeed :");
                                attackSpeed1 = sc.nextDouble();
                                System.out.println("nhap coolDownReduction :");
                                coolDownReduction = sc.nextDouble();
                                System.out.println("nhap money :");
                                money1 = sc.nextInt();
                                System.out.println("nhap lifeSteal :");
                                lifeSteal1 = sc.nextDouble();
                                System.out.println("nhap criticalDamage :");
                                criticalDamage1 = sc.nextDouble();
                                System.out.println("nhap baseDam :");
                                baseDamage1 = sc.nextInt();
                                System.out.println("nhap criticalChance :");
                                criticalChance = sc.nextDouble();
                                Movement movement = new Movement(name, coolDownReduction, armor, magicDefense, movementSpeed, abilityPower, attackSpeed1);
                                PhysicalAttack physicalAttack = new PhysicalAttack(baseDamage1, hp, criticalChance, attackSpeed1, criticalDamage1, lifeSteal1);
                                weaponDescription = new WeaponDescription(physicalAttack, movement, money1);
                                listWeapon.addWeapon(weaponDescription);
                                break;
                            case 2:
                                listWeapon.PrintWeapon();
                                break;
                            case 3:
                                System.out.println("danh sach co rong k :"+listWeapon.checkListWeapon());
                                break;
                            case 4:
                                System.out.println("so luong vu khi :"+listWeapon.getNumberListWeapon());
                                break;
                            case 5:
                                listWeapon.removeAllWeapon();
                                break;
                            case 6:
                                System.out.println("nhap ten vu khi");sc.nextLine();String nameWeapon=sc.nextLine();
                                WeaponDescription weaponDescription1=new WeaponDescription(nameWeapon);
                                System.out.println("kiem tra vu khi co trong listWeapon khong:"+listWeapon.checkYesNoWeapon(weaponDescription1));
                                break;
                            case 7:
                                System.out.println("nhap ten vu khi :");sc.next();String name2=sc.nextLine();
                                WeaponDescription weaponDescription2=new WeaponDescription(name2);
                                System.out.println("hien vu khi da xoa :"+listWeapon.removeWeapon(weaponDescription2));
                                break;
                            case 8:
                                System.out.println("nhap ten :");;sc.next();String name3=sc.nextLine();
                                System.out.println("ket qua tim kiem :");
                                listWeapon.searchWeapon(name3);
                                break;
                            case 9:
                                System.out.println("sap xep theo money vu khi :");
                                listWeapon.sortWeapon();
                                listWeapon.PrintWeapon();
                                break;
                        }
                    }while (chose!=0);
                    break;
                case 3:
                    System.out.println(", toc do danh/s="+heroInteractionWeapon.attackSpeed(attackSpeed1,attackSpeed)+",thoi gian hoi chieu="+heroInteractionWeapon.coolDownReduction(coolDownReduction,coolDownReduction1)+
                            ",% sat thuong chi mang="+heroInteractionWeapon.criticalChance(criticalChance,criticalChance1)+
                            ",% chi mang "+heroInteractionWeapon.criticalDamage(criticalDamage,criticalDamage1)+
                            ",hoi hp/s="+heroInteractionWeapon.healPerSecondHp(healPerSecondHp,0)+
                            ",hoi mana/s="+heroInteractionWeapon.healPerSecondMana(healPerSecondMana,0)+
                            ",% hut mau="+heroInteractionWeapon.lifeSteads(lifeSteal,lifeSteal1));
                    break;
            }
        }while (luachon!=0);
    }
}
