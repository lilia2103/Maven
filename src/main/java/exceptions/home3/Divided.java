package exceptions.home3;

import java.util.Scanner;

public class Divided {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int i = sc.nextInt();

        System.out.println("Enter the second number ");
        int isec = sc.nextInt();

        try{
            int r = i / isec;
            System.out.println(r + " = first / second");
        }catch (ArithmeticException e){
            System.out.println("con't divid in 0");
        }
    }
}
