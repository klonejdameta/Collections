package PriorityQueue.IterateElements2;

import java.util.PriorityQueue;
import java.util.Queue;

public class IteratePriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");

        System.out.println("Elements of Queue" );
        for (String col : queue
        ) {
            System.out.println( col);
        }
    }
}
