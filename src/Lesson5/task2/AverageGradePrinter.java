package Lesson5.task2;

public class AverageGradePrinter {
    public void printerAverageGrade() {
    }

    double averageInMath;
    double averageInEconomy;
    double averageInEnglish;

    void averageGrade(double averageInEnglish, double averageInEconomy, double averageInMath) {
        double result = (averageInEconomy + averageInEnglish + averageInMath) / 3;
        System.out.println(result);


    }


}







