package lesson5.task2;

import lesson4.Student;

public class AverageGradePrinter {

    void printerAverageGrade(Student student) {
        double result = (student.getAverageGradeInEconomy() + student.getAverageGradeInEnglish() + student.getAverageGradeInEnglish()) / 3;
        System.out.println(result);
    }
}







