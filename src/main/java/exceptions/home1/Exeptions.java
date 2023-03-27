package exceptions.home1;

import java.util.Scanner;

public class Exeptions {
    public Exeptions(String exep1) {
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("input number");
        int i = sc.nextInt();

        if (i ==0)
            throw new ArithmeticException("can't be 0");
        else
            System.out.println(1.0/i);
    }
}
