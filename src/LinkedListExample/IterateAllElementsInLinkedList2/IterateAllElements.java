package LinkedListExample.IterateAllElementsInLinkedList2;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateAllElements {
    public static void main(String[] args) {

        LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("Apple");
        arrl.add("Second");
        arrl.add("Orange");
        arrl.add("Third");
        Iterator<String> itr = arrl.iterator();//this is the method
        while(itr.hasNext()){ //checks elements
            System.out.println("Elements of LinkedList are " + itr.next());
        }
    }
}
