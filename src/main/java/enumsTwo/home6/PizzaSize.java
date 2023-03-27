package enumsTwo.home6;

public enum PizzaSize {
    SMALL(5.0),
    MEDIUM(6.5),
    LARGE(8.0);

    private double price;
    PizzaSize(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}
