package controller.methods;

public interface Attack {
    static int attack(int baseDamage, int normalAttack){
        return baseDamage+normalAttack;
    }
}
