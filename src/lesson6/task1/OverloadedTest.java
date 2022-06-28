package lesson6.task1;

public class OverloadedTest {
    public static void main(String[] args) {

        Overloaded overloaded = new Overloaded();
        overloaded.printSum();
        System.out.println(overloaded.printSum());
        System.out.println(overloaded.printSum(11));
        System.out.println(overloaded.printSum(2, 6));
        System.out.println(overloaded.printSum(8, 9, 10));
        System.out.println(overloaded.printSum(7, 8, 1, 3));
    }
}
