package lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

    public static ArrayList<String> sortArrayList(String... inputArrayList) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : inputArrayList) {               //починається додавання еоементів в Ліст, спочатку s прийме нульве значення массиву = One
            if (!arrayList.contains(s)) {              //Ліст пустий, додається елемент, наступний порівнюється с попереднім і якщо такий є, то не додається
                arrayList.add(s);                      //додається в Ліст
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        return arrayList;
    }
}

