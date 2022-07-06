package Lesson8.task2;

public class MathCalculations {

    private static final double PI = 3.14;

    public double calculateCircleArea(int radius) {
        return  PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }

    public void printAreaLength(int radius) {
        System.out.println(radius);
        System.out.println(calculateCircleArea(25));
        System.out.printf("%.1f", calculateCircleLength(24));
    }
}
