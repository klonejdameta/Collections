package PriorityQueue.RetriveFirstElement8;

import java.util.PriorityQueue;

public class FirstElementOutput {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);
        System.out.println("Original Queue "+num);

        System.out.println("First element of Queue" +num.peek());
    }
}
