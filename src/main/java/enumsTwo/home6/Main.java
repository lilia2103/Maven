package enumsTwo.home6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main tp = new Main();
        tp.totalAmount();
    }

    public void totalAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many toppings would you like? (1-5) -> " );
        int numberOfToppings = sc.nextInt();
        System.out.print("What size pizza would you like? (small, medium, large) -> ");
        double sizePrice = getSizePrice(sc.next());
        double totalAmount = numberOfToppings * sizePrice;

        System.out.println("Your pizza will cost $" + totalAmount);
    }

    public double getSizePrice(String str){
        if(str.toLowerCase().equals("small"))
            return PizzaSize.SMALL.getPrice();
        else if(str.toLowerCase().equals("medium"))
            return PizzaSize.MEDIUM.getPrice();
        else
            return PizzaSize.LARGE.getPrice();
    }
}
