package PriorityQueue.PrintElementsOfQueue1;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrintElements {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: "+queue);
//String values does not output in order as input
    }
}
