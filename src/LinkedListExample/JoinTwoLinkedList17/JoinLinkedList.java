package LinkedListExample.JoinTwoLinkedList17;

import java.util.LinkedList;

public class JoinLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        System.out.println("Elements of first List "+ll);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        System.out.println("Elements of second list "+list);

        LinkedList<Integer> join = new LinkedList<>(ll);//add first list at constructor
        join.addAll(list);//add second list as input in method
        System.out.println();
        System.out.println("List after merge "+join);


    }
}
