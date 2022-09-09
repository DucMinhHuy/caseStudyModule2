package model.methods;

import java.io.Serializable;

public interface IAttackSpeed extends Serializable {
     double attackSpeed(double AttackSpeedWeapon,double AttackSpeed);
//        return AttackSpeed+AttackSpeed*AttackSpeedWeapon/100;

}
