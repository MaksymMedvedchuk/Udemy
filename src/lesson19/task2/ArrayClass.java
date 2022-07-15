package lesson19.task2;

public class ArrayClass {

    public static void printArray(String[][] inputArray) {
        System.out.print("{ ");
        int i = 0;
        while (i < inputArray.length) {            //array.length довжина двомірного масиву
            System.out.print("{");
            for (int j = 0; j < inputArray[i].length; j++) {     //array[i].length це довжина нульвого одномірного масиву, його довжина == 2
                if (j != inputArray[i].length - 1) {             //якщо inputArray[i].length(2)-1 не == j(0) // (якщо 1 !=1 то false і перехід еа else?)
                    System.out.print(inputArray[i][j] + ", ");   //-> виводиться перше значкеня з індексом[0][0] + ,
                } else {                                         // else не викон. перехід на слід ітерацію вн цикла
                    System.out.print(inputArray[i][j]);          //[0][1] вихід із вн цикла перехід на зов цикл
                }
            }
                if (i != inputArray.length - 1){                 //і==0, =! дов масиву(3-1)
                    System.out.print("}, ");
                }else {
                    System.out.print("}");
                }
            i++;
        }
        System.out.println(" }");
        }
    }











