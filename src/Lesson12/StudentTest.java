package Lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student("Maksim", 33, 5);
        Student secondStudent = new Student("Igor", 32, 5);
        Student.printEquality(firstStudent, secondStudent);
        Student.printEqualityInEquality(firstStudent, secondStudent);
    }
}
