package abstract_class_and_interface.home6;

public abstract class Vehicle {
    private String number;
    private String type;

    public Vehicle(String number, String type) {
        this.number = number;
        this.type = type;
    }
    public String getNumber(){
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    abstract void operate();
}
