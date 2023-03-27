package abstract_class_and_interface.home6;

public class CommuterRail extends  Vehicle{
    private  String line;
    public CommuterRail(String number, String type,String line){
        super(number, type);
        this.line =line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    @Override
    void operate() {
        System.out.println("operating the commuter rail");
    }
}
