package lesson26.test3;

public class Test1 {
    public Test1() {
        System.out.println("Test1");
    }
    public Test1(int i){
        System.out.println("Test1" + i); //Overload конструктор
    }
    private boolean printInfo(){
        return false;
    }

    public static void main(String[] args) {
        Test1 test1 = new Test2(18);
        System.out.println(test1.printInfo());
    }
}
