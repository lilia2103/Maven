package abstract_class_and_interface.home6;

public class MixesRightOfWay implements  RightOfWay{
    @Override
    public void move() {
        System.out.println("Moving on a mixed (hybrid) right of way");
    }
}
