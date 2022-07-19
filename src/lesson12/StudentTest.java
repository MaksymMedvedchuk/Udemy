package lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student("Maksim", 33, 6);
        Student secondStudent = new Student("Igor", 33, 5);
        Student.printEquality(firstStudent, secondStudent);
        Student.printEqualityInEquality(firstStudent, secondStudent);
    }
}
