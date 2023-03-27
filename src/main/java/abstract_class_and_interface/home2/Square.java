package abstract_class_and_interface.home2;

public class Square  extends Shape{
    @Override
    public void erase() {
        System.out.println("Square has erased");
    }

    @Override
    public void draw() {
        System.out.println("Square has drawn");
    }
}
