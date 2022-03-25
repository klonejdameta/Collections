package LinkedListExample.AddElementAtLastIndex1;

import java.util.LinkedList;

public class AddAtLastPosition {
    public static void main(String[] args) {
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println(arrl);
        System.out.println();
        System.out.println("Adding element at last position ");
        arrl.addLast("I am last");//Appends the specified element to the end of this list
        System.out.println(arrl);
        System.out.println();
        System.out.println("Adding element at last position ");
        arrl.offerLast("I am last - 1");//Inserts the specified element at the end of this list
        System.out.println(arrl);
        System.out.println();
        System.out.println("Adding element at last position ");
        arrl.offer("I am last - 2");//Adds the specified element as the tail (last element) of this list
        System.out.println(arrl);
    }
}
