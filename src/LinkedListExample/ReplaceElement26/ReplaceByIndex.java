package LinkedListExample.ReplaceElement26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReplaceByIndex {
    public static void main(String[] args) {

        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        System.out.println("List before replace "+ num + "\n");

        num.set(4,25);//replace element at index 4 with 25

        System.out.println("List after replac "+num);

    }
}