package ArrayListExample.SortingArrayList8;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(7);
        num.add(5);
        num.add(3);
        num.add(9);
        num.add(2);

        Collections.sort(num);//Ascending order
        System.out.println("Sorted in Ascending order " + num);
        Collections.reverse(num);//Descending order
        System.out.println("Sorted in Descending order " + num);


    }
}
