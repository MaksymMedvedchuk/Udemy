package lesson26.test1.package2;

import lesson26.test1.package1.*;

public class Test2 extends Test1 {
    public Test2() {
    }

    @Override
    public void printInfo() {
        //super.printInfo(); //чому коли оверайдю, то додається супер, це наслідується від батьківського класу? Тоді
        // виводиться Test1 і Test2, а повинно тільки Test2, тому що зміна test2 ссилається на обєкт new Test2();, тому спрацює метод з класа Test2
        System.out.println("Test2");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.printInfo();
    }
}


