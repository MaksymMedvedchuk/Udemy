package lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student(987456, "Maksim", "Medvedchuk", 2012,
                11.1, 9.8, 7.1);
        Student secondStudent = new Student(987124, "Igor", "Frank", 2011,
                11.1, 10.2, 11.5);
        Student thirdStudent = new Student(989235, "Daria", "Binevich", 2011,
                10.8, 10.1, 11.9);

        firstStudent.printAverageGrade();
        secondStudent.printAverageGrade();
        thirdStudent.printAverageGrade();
    }
}






