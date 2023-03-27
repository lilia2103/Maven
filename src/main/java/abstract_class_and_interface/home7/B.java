package abstract_class_and_interface.home7;

public class B {
    double getPercentage(){
        double total = sub1 + sub2 + sub3 + sub4;
        return total / 4;
    }
    private int sub1;
    private int sub2;
    private int sub3;
    private int sub4;

    public B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        if (sub1 <= 100 && sub1 >= 0)
        this.sub1 = sub1;
        else this.sub1=0;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        if (sub2 <= 100 && sub2 > -1)
        this.sub2 = sub2;
        else this.sub2 = 0;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
       if (sub3 <= 100 && sub3 > -1)
        this.sub3 = sub3;
       else this.sub3 = 0;
    }

    public int getSub4() {
        return sub4;
    }

    public void setSub4(int sub4) {
        if (sub4 <= 100 && sub3 > -1)
        this.sub4 = sub4;
    }
}
