package LinkedListExample.AddElementsInposition9;

import java.util.LinkedList;

public class AddSomeElements {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");

        System.out.println("Original linked list:" + l_list);

        // create a new collection and add some elements

        LinkedList<String> new_l_list = new LinkedList<String>();
        new_l_list.add("White");
        new_l_list.add("Pink");

        // Add the collection in the second position of the existing linked list
        l_list.addAll(1, new_l_list);

        System.out.println("LinkedList:" + l_list);
    }
}
