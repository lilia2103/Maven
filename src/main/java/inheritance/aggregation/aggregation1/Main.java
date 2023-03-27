package inheritance.aggregation.aggregation1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Person stu1 = new Person("Lilia",19);
        Person stu2 =  new Person("Aram", 22);
        Person stu3 = new Person("djak",44);

        List<Person> students =  new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        Education school =  new Education();
        school.setStudent(students);
        for (Person peron:school.getStudent()) {
            System.out.println(peron.getName() + " " + peron.getAge());

        }
    }
}
