package inheritance.composition.composition2;

public class Main {
    public static void main(String[] args) {
        Fuel fuel = new Fuel();
        Car car = new Car(fuel);
        car.getFuel().fuelIsNotEmpty();
    }
}
