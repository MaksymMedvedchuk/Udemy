package lesson18;

public class Runner {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Helly");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        StringBuilder stringBuilder3 = stringBuilder1;
        System.out.println(StringBuilderTest.printParametersEquality(stringBuilder1, stringBuilder2));
    }
}
