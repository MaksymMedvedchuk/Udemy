package lesson26.test2.package2;

import lesson26.test2.package1.Test1;

public class Test2 extends Test1 {

    @Override
    public void printFirstInfo() {
        System.out.println("Test2");
    }

    public void printSecondInfo() {
        Test2 test2 = new Test2();
        test2.printFirstInfo();
    }

    public void printThirdInfo() {
        Test1 test1 = new Test2();
        // test1.printFirstInfo; //Чому тут помилка у нас же метод printFirstInfo в класі Test1 protected і його видно в
        // класах/пакетах нслідника
    }

    public static void main(String[] args) {
        Test2 test2a = new Test2();
        test2a.printFirstInfo();
        test2a.printSecondInfo();
        test2a.printThirdInfo();
    }
}
