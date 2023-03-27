package inheritance.aggregation.aggregation2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Employee employee1 = new Employee("Lilia", 19);
        Employee employee2 = new Employee("Lk" ,40);
        bank.addEmployee(employee1);
        bank.addEmployee(employee2);
        bank.removeEmloyee(employee1);
        bank.removeEmloyee(employee2);
    }
}
