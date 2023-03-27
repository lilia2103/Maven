package exceptions.home6;

public class ThreeTypes {
    public static void main(String[] args) {

    }
    void exeptions() throws Exception1, Exception2,Exception3{
        int r = (int)(Math.random() * 3);

        switch (r){
            case 0:
                throw new Exception1();
            case 1:
                throw new Exception2();
            case 2:
                throw new Exception3();
        }
    }
}
