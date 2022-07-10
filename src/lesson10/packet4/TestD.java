package lesson10.packet4;

import lesson10.packet1.TestA;
import lesson10.packet1.packet2.packet3.TestC;
import lesson10.packet4.packet5.TestE;
import static lesson10.packet1.packet2.TestB.*;

public class TestD {
    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.printName();
        System.out.println(arg1);
        System.out.println(arg2);
        TestC testC = new TestC();
        testC.printBoolean();
        TestE testE = new TestE();
        testE.printNumber();
    }
}
