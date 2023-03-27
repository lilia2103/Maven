package enumsTwo.home1;

public class Main  extends Change {
    public static void main(String[] args) {
        for(TrafficL traffic : TrafficL.values()){
            for(int i = 0; i < 2; ++i){
                if(i < 1){
                    System.out.println("\n the color of traffic light is -> " + traffic.change(traffic));
                }
                System.out.print(i + 1 + " ");
            }
        }
    }
}
