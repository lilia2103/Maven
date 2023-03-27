package abstract_class_and_interface.home2;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.erase();
        Square sq = new Square();
        sq.draw();
        sq.erase();
        Triangle tr = new Triangle();
        tr.draw();
        tr.erase();
    }
}
