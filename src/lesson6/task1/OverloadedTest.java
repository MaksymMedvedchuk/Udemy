package lesson6.task1;

public class OverloadedTest {
    public static void main(String[] args) {

        Overloaded overloaded = new Overloaded();
        overloaded.printSumNumber();
        //System.out.println(overloaded.printSumNumber());
        //System.out.println(overloaded.printSumNumber(2, 6));
        //System.out.println(overloaded.printSumNumber(8, 9, 10));
        //System.out.println(overloaded.printSumNumber(7, 8, 1, 3));
        //System.out.println(overloaded.printSumNumber(11));

        int sumZero = overloaded.printSumNumber();
        System.out.println(sumZero);
        int sumTwoNumbers = overloaded.printSumNumber(4, 6);
        System.out.println(sumTwoNumbers);
        int sumThreeNumbers = overloaded.printSumNumber(4,6,8);
        System.out.println(sumThreeNumbers);
        int sumFourNumbers = overloaded.printSumNumber(10,11,12,13);
        System.out.println(sumFourNumbers);
        int sumOneNumber = overloaded.printSumNumber(10);
        System.out.println(sumOneNumber);











    }
}
