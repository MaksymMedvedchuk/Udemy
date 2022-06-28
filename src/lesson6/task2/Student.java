package lesson6.task2;

public class Student {
    private int studentId;
    private String name;
    private String surname;
    private int age;
    private String course;

    public Student(int studentId, String name, String surname, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }
    public Student(int studentId, String name, String surname, String course) {
        this(studentId, name, surname, 0, course);
    }
    public Student() {
    }
}
































