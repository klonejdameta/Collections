package LinkedListExample.ShuffleElements16;

import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        System.out.println("List before shuffle "+list);
        Collections.shuffle(list);//we get different result every time we exc
        System.out.println("List after shuffle "+list);
    }
}
