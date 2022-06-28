package lesson7.task1;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(double salary) {
        this.salary = salary;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(int id) {
        this.id = id;
    }

    public void printId() {
        System.out.println("ID= " + id);
    }

    public void printSurname() {
        System.out.println("Surname= " + surname);
    }

    public void printSalary() {
        System.out.println("Salary= " + salary);
    }
}



