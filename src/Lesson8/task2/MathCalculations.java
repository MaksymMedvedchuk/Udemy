package Lesson8.task2;

public class MathCalculations {

    private static final double PI = 3.14;

    public void printAreaCircle(int radius) {
        double areaCircle = PI * radius * radius;
    }

    public static void printLengthCircle(int radius) {
        double areaLength = 2 * PI * radius;
    }

    public void printMathCalculations(int radius) {
        System.out.println(radius);
    }
}
