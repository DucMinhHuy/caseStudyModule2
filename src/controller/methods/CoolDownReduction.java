package controller.methods;

public interface CoolDownReduction {
     static double coolDownReduction(double CoolDownReduction) {
       return 6+(6*CoolDownReduction)/100;
    }
}
