package lesson18;

public class StringBuilderTest {
    public int age1;

    public StringBuilderTest(int age1) {
        this.age1 = age1;
    }

    public static boolean printParametersEquality(int i1, int i2) {
        if (i1 == i2) {
            return true;
        } else {
            return false;
        }
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age1) {
        this.age1 = age1;
    }
}




