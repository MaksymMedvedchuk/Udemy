package lesson20;

public class Array {

    public static String[] sortArray(String[]... inputArray) {
        int length = 0;
        for (String[] array : inputArray) {
            length += array.length;
        }
        String[] target = new String[length];
        int count = 0;
        for (String[] array : inputArray) {
            for (String s : array) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = sortArray(new String[]{"One", "Two", "Three"}, new String[]{"One", "Four", "Five"});
        for (String s : args) {
            for (int i = 0; i < target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }
        }
        for (String s : target) {
            System.out.print(s + " ");
        }
    }
}