package Lesson9.task2.variant1;

public class Test1 {
    private int a = 1;
    private static int b = 2; //не можна створювати змінні з однаковим ім'ям

    public void printNumber(int firstNumber){
        System.out.println(a);
        System.out.println(this.a);
    }
}
//думав, що виведеться 4 і 1