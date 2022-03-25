package LinkedListExample.CloneLinkedList18;

import java.util.LinkedList;

public class CloneList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList <String> ();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        System.out.println("Original linked  list: " + list1);
        LinkedList <String> list2 = new LinkedList <String> ();
        list2 = (LinkedList)list1.clone();
        System.out.println("Cloned linked list: " + list2);
    }
}
