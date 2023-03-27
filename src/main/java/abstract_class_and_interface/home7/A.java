package abstract_class_and_interface.home7;

public class A extends Marks{
    @Override
    double getPercentage() {
        double total = subject1 + subject2 + subject3;

        return 0;
    }
    private int subject1;
    private int subject2;
    private int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public int getSubject1() {
        return subject1;
    }

    public void setSubject1(int subject1) {
        this.subject1 = subject1;
    }

    public int getSubject2() {
        return subject2;
    }

    public int getSubject3() {
        return subject3;
    }

    public void setSubject2(int subject2) {
        this.subject2 = subject2;
    }

    public void setSubject3(int subject3) {
        this.subject3 = subject3;
    }
}
