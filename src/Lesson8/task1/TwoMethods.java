package Lesson8.task1;

public class TwoMethods {

    public static int Multiply(int firstArg, int secondArg, int thirdArg) {
        return firstArg * secondArg * thirdArg;
    }

    public static void printDivision(double firstArg, double secondArg) {
        double result = firstArg / secondArg;
        System.out.printf("%.2f", result);
    }
}
