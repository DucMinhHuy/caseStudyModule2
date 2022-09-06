package controller.methods;

public interface CriticalChance {
     static double criticalChance(double CriticalChance,double Critical) {
        return CriticalChance+(CriticalChance*Critical)/100;
    }
}
