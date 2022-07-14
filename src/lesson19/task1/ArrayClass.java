package lesson19.task1;

import java.util.Arrays;

public class ArrayClass {

    public static int[] printSorting(int[] inputInt) {
        for (int i = 0; i < inputInt.length; i++) {
            Arrays.sort(inputInt);
            System.out.print(inputInt[i] + " ");
        }
        return inputInt;
    }

}


