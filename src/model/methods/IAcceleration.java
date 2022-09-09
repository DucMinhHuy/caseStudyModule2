package model.methods;

import java.io.Serializable;

public interface IAcceleration extends Serializable {
    double acceleration(double Acceleration,double accelerationWeapon);
    // 365.5*Acceleration/100;
}
