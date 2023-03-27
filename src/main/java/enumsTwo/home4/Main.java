package enumsTwo.home4;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("Enter a day");
            Scanner sc = new Scanner(System.in);
            String str = sc.next().toUpperCase();

            if(str.equals(DaysOfWeek.SUNDAY.toString()) || str.equals(DaysOfWeek.SATURDAY.toString()))
                System.out.println(str + " is a weekend day");
            else
                System.out.println(str + " is a weekday");
        }
}
