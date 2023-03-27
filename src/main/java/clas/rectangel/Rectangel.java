package clas.rectangel;

public class Rectangel {
    int height;
    int widght;
    public Rectangel(){

    }
    int calclateArea(int height, int widte){
        int areaRec = height *widte;
        return areaRec;
    }
    public static void main(String[] args) {
        Rectangel rr = new Rectangel();
        System.out.println(rr.calclateArea(3,12));
    }
}
