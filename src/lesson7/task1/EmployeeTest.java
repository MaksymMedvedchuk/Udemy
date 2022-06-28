package lesson7.task1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(789122); //ID не створюється
        Employee employee2 = new Employee("Medvedchuk");
        Employee employee3 = new Employee(100.5);

        System.out.println(employee1.id);
        System.out.println(employee2.surname);
        //System.out.println(employee3.salary);

        employee1.printId();
        employee2.printSurname();
        employee3.printSalary();
    }
}