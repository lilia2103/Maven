package abstract_class_and_interface.home7;

public class Main {
    public static void main(String[] args) {
        A a = new A(45,88,444);
        B b = new B(656,25,565,10);

        System.out.println("Percentage of student A = " + a.getPercentage());
        System.out.println("Percentage of student B = " + b.getPercentage());
    }
}
