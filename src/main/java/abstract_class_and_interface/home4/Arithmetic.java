package abstract_class_and_interface.home4;

public class Arithmetic implements Test{
    int n = 5;

    @Override
    public void square() {
        System.out.println(n*n);
    }
}
