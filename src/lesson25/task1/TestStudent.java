package lesson25.task1;

public class TestStudent {
    public static void main(String[] args) {

        //Student student = new Student(new StringBuilder("Maks"), 3, 8); //з використання змінних класса на пряму
        Student student = new Student();
        student.setName(new StringBuilder("Maks"));
        student.setCourse(3);
        student.setGrade(11);
        student.printInfo();
    }
}
