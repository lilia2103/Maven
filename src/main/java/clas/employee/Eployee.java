package clas.employee;

public class Eployee {String id;
    String name;
    String department;
    int age;
    String gender;


    public Eployee(String id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }
    void printemployee(){
        System.out.println(id + name + department + age + gender);
    }

    public static void main(String[] args) {
        Eployee e1 =new Eployee("256256", "Anna", "Managment",23, "female");
        Eployee e2 =new Eployee("256257", "john", "Accountancy", 26, "male");
        Eployee e3 =new Eployee("256258", " Greg", "managm=ement",23, "male");
        e1.printemployee();
        e2.printemployee();
        e3.printemployee();


    }
}
