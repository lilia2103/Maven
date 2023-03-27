package abstract_class_and_interface.home5;

public class ChildOne  extends  Base{
    @Override
    public void enable() {
        super.enable();
        System.out.println("Hello from ChildOne");
    }
}
