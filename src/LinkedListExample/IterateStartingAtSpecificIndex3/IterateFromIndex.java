package LinkedListExample.IterateStartingAtSpecificIndex3;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateFromIndex {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Blue");
        l_list.add("White");
        l_list.add("Brown");
// set Iterator at specified index
        Iterator iterator = l_list.listIterator(1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
