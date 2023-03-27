package exceptions.home5;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int i = sc.nextInt();
        try{
            if (i < 0 ){
                throw new IllegalArgumentException("Invalid number ");
            }
            double square = Math.sqrt(i);
            System.out.println("The sqrt of number = " + square);
        }catch (Exception e){
            System.out.println("invalid number ");
        }
    }
}
