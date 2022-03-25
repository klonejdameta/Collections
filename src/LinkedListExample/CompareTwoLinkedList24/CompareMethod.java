package LinkedListExample.CompareTwoLinkedList24;

import java.util.LinkedList;

public class CompareMethod {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(0,1);
        list1.add(1,2);
        list1.add(2,3);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,1);
        list2.add(1,2);
        list2.add(2,3);
        list2.add(3,8);

        System.out.println(list1.equals(list2));//this method return true or false


    }
    }


