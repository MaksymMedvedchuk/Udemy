package lesson6.task1;

public class Overloaded {

    public int printSum() {
        return printSum(0);
    }
    public int printSum(int arg1) {
        return printSum(arg1, 0);
    }
    public int printSum(int arg1, int arg2) {
        return printSum(arg1, arg2, 0);
    }
    public int printSum(int arg1, int arg2, int arg3) {
        return printSum(arg1, arg2, arg3, 0);
    }
    public int printSum(int arg1, int arg2, int arg3, int arg4) {
        return arg1 + arg2 + arg3 + arg4;
    }
}
