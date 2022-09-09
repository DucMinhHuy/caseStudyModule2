package model.methods;

import java.io.Serializable;

public interface ICoolDown extends Serializable {
   double coolDown(double coolDownReduction,double coolDownReductionWdeapon);
//        return CoolDown+CoolDown*coolDownReduction/100 ;
}
