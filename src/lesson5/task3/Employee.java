package lesson5.task3;

public class Employee {

    private int id;
    private String surname;
    private int age;
    private int salary;
    private String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
        //Ми створюємо конструктор для полегшення роботи: якщо у нас буде декілька об'єктів класса з однаковими атрибутами?
    }

    public int increaseSalary() {
        salary *= 2;
        return salary;
        //return salary *= 2;
        //без різниці як писати?

    }

    public void printNewSalary() {
        System.out.print("Worker " + this.surname + " from department " + this.department + " with id card " +
                this.id + " get ");
        System.out.println(increaseSalary());
        System.out.println();
    }













    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


