package enumsTwo.home5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main ts = new Main();
        ts.correspondingSeason();
    }
    public void correspondingSeason(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature ");
        double t = sc.nextDouble();
        if(t >= Season.SPRING.getLowest() && t <= Season.SPRING.getHighest()){
            System.out.println("Corresponding season is " + Season.SPRING.toString());
        }
        else if(t >= Season.SUMMER.getLowest() && t <= Season.SUMMER.getHighest()){
            System.out.println("Corresponding season is " + Season.SUMMER.toString());
        }
        else if(t >= Season.AUTUMN.getLowest() && t <= Season.AUTUMN.getHighest()){
            System.out.println("Corresponding season is " + Season.AUTUMN.toString());
        }
        else if(t >= Season.WINTER.getLowest() && t <= Season.WINTER.getHighest())
            System.out.println("Corresponding season is " + Season.WINTER.toString());
        else
            System.out.println("Unknown");
    }
}
