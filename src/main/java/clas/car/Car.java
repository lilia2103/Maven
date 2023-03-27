package clas.car;

public class Car {
    String model;
    String color;
    int currentSpeed;
    boolean isEngineStart;

    public Car(String model, String color, int currentSpeed, boolean isEngineStart) {
        this.model = model;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.isEngineStart = isEngineStart;
    }

    boolean stopEngine() {
        isEngineStart = false;
        return false;
    }

    boolean startEngine() {
        isEngineStart = true;
        return true;
    }
}
