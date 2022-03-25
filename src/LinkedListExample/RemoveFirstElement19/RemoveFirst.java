package LinkedListExample.RemoveFirstElement19;

import java.util.LinkedList;

public class RemoveFirst {
    public static void main(String[] args) {
        LinkedList<String> col = new LinkedList <String> ();
        col.add("Blue");
        col.add("Red");
        col.add("Green");
        col.add("Black");
        col.add("White");
        col.add("Pink");
        System.out.println("Original linked  list: " + col);
        System.out.println();
        //remove and return dhe first element
        System.out.println("First element tha has been removed from list using pop() method: "+col.pop());
        System.out.println();
        System.out.println("First element remaining  after using pop() mehod: "+col.peek());
        System.out.println();
        System.out.println("Lists after changes "+col);

    }
}
