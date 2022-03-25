package ArrayListExample.TrimCapacityOfArrayList19;

import java.util.ArrayList;

public class TrimCapacity {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(1);
        arraylist.add(1);
        arraylist.add(1);
        System.out.println("List before triming the capacity "+arraylist);

        arraylist.trimToSize();//trimToSize()method trims the capacity of ArrayList to the current list size.

        System.out.println("List after triming "+arraylist);

    }
}
