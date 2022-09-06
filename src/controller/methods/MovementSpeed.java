package controller.methods;

public interface MovementSpeed {
    static double MovementSpeed(double movementSpeed){
        return 365.5+movementSpeed/100*365.5;
    }
}
