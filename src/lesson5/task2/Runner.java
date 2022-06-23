package lesson5.task2;

import lesson4.Student;

public class Runner {
    public static void main(String[] args) {
        AverageGradePrinter averageGradePrinter = new AverageGradePrinter();
        averageGradePrinter.printerAverageGrade(new Student(987456, "Maksim", "Medvedchuk", 2012,
                11.1, 9.8, 7.1));
    }
}
