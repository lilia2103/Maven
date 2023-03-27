package abstract_class_and_interface.home5;

public class Main {
    public static void main(String[] args) {
        ChildOne child = new ChildOne();
        ChildTwo childTwo = new ChildTwo();
        child.enable();
        childTwo.enable();
        child.disable();
        System.out.println("------------");
        child.enable();
        childTwo.enable();

    }
}
