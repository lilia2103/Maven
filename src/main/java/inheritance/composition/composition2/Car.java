package inheritance.composition.composition2;

public class Car {
    private  Fuel fuel;

    public Car(Fuel fuel) {
        this.fuel = fuel;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

}
