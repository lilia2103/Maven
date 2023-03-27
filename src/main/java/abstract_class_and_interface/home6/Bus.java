package abstract_class_and_interface.home6;

public class Bus extends  Vehicle{
    public Bus(String number, String type){
        super(number,type);
    }

    @Override
    void operate() {
        System.out.println("opeating the bus");
    }
}
