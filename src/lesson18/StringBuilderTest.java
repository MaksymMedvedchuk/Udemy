package lesson18;

public class StringBuilderTest {

    public static boolean printParametersEquality(StringBuilder sb1, StringBuilder sb2) {
        return sb1.toString().equals(sb2.toString()); //toString повертає рядок, що представляє об'єкт і ми його порівнюєм
                                                      //з іншим рядком, який повертаємо?
    }
}
