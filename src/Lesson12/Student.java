package Lesson12;

public class Student {

    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void printEquality(Student student1, Student student2) { //статичний метод, щоб я визивав метод не через обєкт, а через клас?
        if (student1.name == student2.name && student1.age == student2.age && student1.course == student2.course) {
            System.out.println("Information about students is the same.");
        } else {
            System.out.println("Information about students is not the same.");
        }
    }

    public static void printEqualityInEquality(Student student1, Student student2) {
        if (student1.name == student2.name)
        if (student1.age == student2.age)
        if (student1.course == student2.course)
        System.out.println("Information about students is the same");
        else
        System.out.println("The names of the students are different, but the course and age are the same");
        else
        System.out.println("The name and age of the students are the same, but the course is different");
        else
        System.out.println("The name and course of the students are the same, but the age is different");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}











