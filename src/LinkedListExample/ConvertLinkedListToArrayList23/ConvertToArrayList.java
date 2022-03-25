package LinkedListExample.ConvertLinkedListToArrayList23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertToArrayList {
    public static void main(String[] args) {
        /*A LinkedList can be converted into an ArrayList by creating an ArrayList such that the parameterized
        constructor of the ArrayList initialises it with the elements of the LinkedList.
         */
        LinkedList<String> l = new LinkedList<>();
        l.add("Orange");
        l.add("Apple");
        l.add("Peach");
        l.add("Guava");
        l.add("Pear");
        List<String> aList = new ArrayList<>(l);
        System.out.println("The ArrayList elements are: ");
        for (String i : aList) {
            System.out.println(i);
        }
    }
}