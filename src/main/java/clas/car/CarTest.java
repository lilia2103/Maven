package clas.car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 =new Car("Mercede C203", "Black",57, true);
        Car c2 =new Car("Mersede S505", "White",45,false );
        System.out.println(c1.startEngine());
        System.out.println(c2.startEngine());
    }
}
