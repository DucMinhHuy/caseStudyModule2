package model.methods;

import java.io.Serializable;

public interface ICriticalDamage extends Serializable {
     double criticalDamage(double CriticalDam,double criticalDam);
        //baseDamage of hero
//        return baseDamage*CriticalDamage/100+baseDamage*CriticalDam/100;
    // làm được thì tính thêm về giá trị của hero khi mà cộng thêm vũ khí thì CriticalDam sẽ khác;

}
