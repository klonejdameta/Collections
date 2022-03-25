package LinkedListExample.IterateInReverseOrder4;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterating {
    public static void main(String[] args) {
        LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        arrl.add("Fourth");
        System.out.println("LinkedList before reversing "+arrl);
        Iterator<String> itr = arrl.descendingIterator();//method descendingIterator() returns an Iterator object with reverse order
        System.out.println("This is the reversed LinkedList ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
