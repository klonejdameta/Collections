package LinkedListExample.RemoveFirstAndLastElement13;

import java.util.LinkedList;

public class RemoveFirstLast {
    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        num.add(12);
        num.add(14);
        num.removeFirst();
        num.removeLast();
        System.out.println("List without first and last element " +num);
        System.out.println();
        num.removeIf((Integer i) -> i<8);//removes elements smaller than given value
        System.out.println("Remaing elementd above index "+ num);
        System.out.println();
        num.clear();//removes all elements
        System.out.println(num);
    }
}