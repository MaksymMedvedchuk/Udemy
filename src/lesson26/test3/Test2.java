package lesson26.test3;

public class Test2 extends Test1 {
    public Test2(int i) {
        super(i);
        System.out.println("Test2");
    }

    public boolean printInfo() { //новий метод, так як в Test1 метод private
        return true;
    }
}

