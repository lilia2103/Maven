package inheritance.aggregation.aggregation1;
import java.util.*;
public class Education {
    private List<Person> student;
    public Education(){

    }

    public List<Person> getStudent() {
        return student;
    }

    public void setStudent(List<Person> student) {
        this.student = student;
    }
}
