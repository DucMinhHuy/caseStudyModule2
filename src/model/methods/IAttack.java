package model.methods;

import java.io.Serializable;

public interface IAttack extends Serializable {
    int attack(int normalAttack, int baseDam);
//        return baseDamage+normalAttack;

}
