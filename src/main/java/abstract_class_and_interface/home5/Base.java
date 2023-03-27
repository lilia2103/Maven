package abstract_class_and_interface.home5;

public class Base {
    public void enable(){
        if (b) {
            System.out.println("Hello from PArent class");
        }else System.out.println("shnorhavr amanr ev surb chnund");
    }
    static  boolean b = true;
    public void disable(){
        Base.b = !b;
    }
}
