package inheritance.homework2;

public class SubClass extends SuperClass{
    String message = "Hello SubClass class";
    public void print(){
        System.out.println(super.message);
        System.out.println(message);
    }
}
