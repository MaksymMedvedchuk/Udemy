package lesson19.task1;

public class Runner {
    public static void main(String[] args) {
        int[] array = {1, -3, -8, 7, 5, 11, -11};
        ArrayClass.sortArray(array);
        for (int i : array) {           // з права на ліво, array - по чому ми проходимось, і - назва ел-ту, int - тип даних ел-та по якому проходимось
            System.out.print(i + " ");
        }
    }
}
