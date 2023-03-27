package exceptions.home2;

import java.util.Scanner;

public class Size extends Throwable {
    public static void main(String[] args) throws Size, Exception {
        Size size = new Size();
        size.sumOf();
    }
    void sumOf() throws Size, Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inpute integers:");
        int s = sc.nextInt();
        int sum = 0;
        System.out.println("Inpute integers for array");
        for (int i = 0; i < s; i++) {
            try {
                sum += sc.nextInt();
            }catch (Exception e){
                throw new Exception("accept integer values");
            }
        }
        System.out.println("elements: " + sum);
    }
}
