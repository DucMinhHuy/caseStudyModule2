package model.methods;

import java.io.Serializable;

public interface ICoolDownReduction extends Serializable {
      double coolDownReduction(double CoolDownReduction,double coolDownReductionWeapon);
//       return 6+(6*CoolDownReduction)/100;
}
