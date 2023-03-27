package inheritance.aggregation.aggregation3;
import java.util.*;
public class SportMode {
    List<Car> list =  new ArrayList<>();
    public List<Car> getList(){
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }
    public SportMode(){

    }
}
