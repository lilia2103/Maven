package exceptions.home7;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) throws Exception {

        Age obj = new Age();
        obj.age();
    }

    void age() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age < 0 || age > 110) {
            throw new Exception("ches ka et tariqin lines normal tiv gri ");
        }else {
            System.out.println("tariqd: " + age);
        }
    }
}
