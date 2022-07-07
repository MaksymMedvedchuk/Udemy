package lesson10.packet4.packet5;

import lesson10.packet1.TestA;

public class TestE {
    public int arg1 = 15; //Чому не можна використати приватне поле, ми ж цей клас імпортуєм?

    public void printNumber() {
        System.out.println(arg1);
    }
}
