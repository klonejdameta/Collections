package PriorityQueue.RemoveAllElements5;

import java.util.PriorityQueue;

public class RemoveElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        System.out.println("Queue after removing all elements ");
        num.clear();
        System.out.println(num);
    }
}
