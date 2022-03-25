package LinkedListExample.RemoveAllElements14;

import java.util.LinkedList;

public class RemoveAll {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        num.add(12);
        num.add(14);

        num.clear();
        System.out.println("List is empty "+num);
    }
}
