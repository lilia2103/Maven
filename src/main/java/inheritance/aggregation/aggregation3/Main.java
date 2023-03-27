package inheritance.aggregation.aggregation3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car("BMW x6", 421);
        Car obj2 = new Car("Meredes c class", 44);
        Car obj3 = new Car("BMW m5",11);

        List<Car> cars = new ArrayList<>();
        cars.add(obj1);
        cars.add(obj2);
        cars.add(obj3);

        SportMode sm = new SportMode();
        sm.setList(cars);
        for (Car car: sm.getList()) {
            System.out.println(car.getMark()+" " + car.getMark() );
        }
    }
}
