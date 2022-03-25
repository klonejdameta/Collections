package LinkedListExample.CheckIfListIsEmpty25;

import java.util.LinkedList;

public class CheckIfEmpty {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,1);
        list2.add(1,2);
        list2.add(2,3);
        list2.add(3,8);

        System.out.println(list2.isEmpty() +"\n");//check if list is empty,return true or false
        System.out.println(list2.indexOf(8));//return the index of paramter 8
    }
}
