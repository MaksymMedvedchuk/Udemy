package Test;

import java.util.Arrays;

public class BankAccountTest {
    public static void main(String[] args) {

        int[][] array2 = {{5, 7, 3, 17}, {7, 2, 1, 12}, {8, 1, 2, 3}};


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(" " + array2[i][j] + " ");
                System.out.println();
                System.out.println(Arrays.deepToString(array2));
            }
        }
    }
}













