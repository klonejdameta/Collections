package PriorityQueue.InsertASpecificElement4;

import java.util.PriorityQueue;

public class InsertElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        System.out.println("Elements before insert "+num +"\n");
        num.offer(12);
        num.offer(14);
        System.out.println("Elements after insert "+num);
    }
}
