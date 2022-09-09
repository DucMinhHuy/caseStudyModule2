package model.methods;

import java.io.Serializable;

public interface ICriticalChance extends Serializable {
      double criticalChance(double Critical,double CriticalWeapon) ;
//        return CriticalChance+(CriticalChance*Critical)/100;

}
