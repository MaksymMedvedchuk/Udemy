package lesson26.test4;


    public class Test {
        public static void printInfo(Test1 inputTest1, Test2 inputTest2) {
            System.out.println("Hello");
        }

        public static void printInfo(Test2 inputTest2, Test1 inputTest1) {
            System.out.println("Bye");
        }

    public static void main(String[] args) {
        Test2 test = new Test2();
        //Test.printInfo(test, test);
    }
}
