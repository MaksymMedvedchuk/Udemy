package lesson9.task2.variant3;

public class Test3 {
    private int a = 1;
    private static int b = 2;

    public void printNumber(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
}
