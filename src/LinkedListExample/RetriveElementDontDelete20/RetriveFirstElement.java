package LinkedListExample.RetriveElementDontDelete20;

import java.util.LinkedList;

public class RetriveFirstElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        System.out.println("List elements "+list + "\n");

        //Retrieve but does not remove, the first element of a linked list
        System.out.println("Retrive element using peekFirst() method: "+ list.peekFirst() + "\n");//returns null if there is ne element

        System.out.println("Retrive element using peek() method: "+list.peek());//both methods works the same way

    }
}
