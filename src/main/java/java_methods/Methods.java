package java_methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

    Methods sc = new Methods();
    Scanner os = new Scanner(System.in);

    System.out.println("Inpute two integers");
    int i = os.nextInt();
    int j = os.nextInt();
    System.out.println(sc.one(i,j));


    sc.two();

    System.out.println("Enter a boolean;");
    boolean a = os.nextBoolean();
    sc.aBoolean(a);


    System.out.println(("Enter two floats;"));
    float f = os.nextFloat();
    float v = os.nextFloat();
    System.out.println(sc.aFloat(f, v));

    sc.itself();
}

    /**
     * parm i;
     * parm j;
     */

    int one(int i, int j){
        return i;
    }

    /**
     * return nothing
     */
    void two (){

    }

    /**
     *
     * @param a
     * @return
     */

    boolean aBoolean(boolean a){
        System.out.println(("Hello world"));
        return a;
    }

    /**
     *
     * @param a
     * @return
     */
    char aChar(char a){
        return a;
    }

    float aFloat(float k, float l){
        return  k;
    }

    /**
     * recursion
     */
    int i = 0;

    void itself() {
        while (i < 10) {
            i++;
            itself();
        }
    }

}
