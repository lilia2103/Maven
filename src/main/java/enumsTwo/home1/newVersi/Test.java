package enumsTwo.home1.newVersi;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


import static enumsTwo.home1.newVersi.TrafficLight.*;

public class Test extends  State{

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input color");
        String color = sc.nextLine();
        Test obj = new Test();
        obj.changeState(color);
    }
    @Override
    public void changeState(String color) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            switch (TrafficLight.valueOf(color)){
                case YELLOW:
                    System.out.println("current color "+ color);
                    TimeUnit.SECONDS.sleep(YELLOW.getSec());
                    color = String.valueOf(GREEN);
                    break;
                case GREEN:
                    System.out.println("current color " + color);
                    TimeUnit.SECONDS.sleep(GREEN.getSec());
                    color = String.valueOf(RED);
                    break;
                case RED:
                    System.out.println("current color " + color);
                    TimeUnit.SECONDS.sleep(RED.getSec());
                    color = String.valueOf(YELLOW);
                    break;
            }

        }

    }
}
