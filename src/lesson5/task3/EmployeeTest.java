package lesson5.task3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee(987777, "Petrov", 31, 1500, "IT");
        Employee worker2 = new Employee(569812, "Ivanov", 32, 1650, "IT");

        worker1.doubleSalary();
        worker2.doubleSalary();

        System.out.println(worker1.getSalary());
        System.out.println(worker2.getSalary());
    }
}
