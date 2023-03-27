package inheritance.homeworke4;

public class Truck extends Car{
    private int capasity;
    public Truck(){
        super();
        capasity = 0;
    }
    public int getCapasity(){
        return capasity;
    }

    public void  setCapasity(int capasity){
        this.capasity=capasity;
    }
}
