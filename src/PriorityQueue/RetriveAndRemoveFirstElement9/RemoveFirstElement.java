package PriorityQueue.RetriveAndRemoveFirstElement9;

import java.util.PriorityQueue;

public class RemoveFirstElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(1);
        num.add(3);
        num.add(4);
        num.add(7);
        num.add(5);
        num.add(8);
        System.out.println("Original Queue "+num +"\n");
        System.out.println("First element that is removed: " + num.poll() +"\n");
        System.out.println("Queue after retrive and remove firs element "+num);

    }
}
