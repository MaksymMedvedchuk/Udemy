package lesson25.task1;

import lesson25.task1.Student;

public class TestStudent {
    public static void main(String[] args) {

        //Student student = new Student(new StringBuilder("Maksim"), 2, 20);
        Student student = new Student();
        student.setName(new StringBuilder("Maksim"));
        student.setCourse(2);
        student.setGrade(9);
        student.printInfo();
    }
}
