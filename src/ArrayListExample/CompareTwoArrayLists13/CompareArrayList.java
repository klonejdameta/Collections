package ArrayListExample.CompareTwoArrayLists13;

import java.util.ArrayList;
import java.util.Collections;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(9);

        boolean val = numbers.equals(numbers2);
        System.out.println(val);
    }
}
