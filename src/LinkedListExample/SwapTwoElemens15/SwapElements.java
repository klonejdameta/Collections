package LinkedListExample.SwapTwoElemens15;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);

        System.out.println("Original list "+ll);

        Collections.swap(ll,1,3);//method to swap values at given indexes

        System.out.println("Values after swap "+ll);

    }
}
