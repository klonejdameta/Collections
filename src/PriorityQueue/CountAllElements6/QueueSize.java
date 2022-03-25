package PriorityQueue.CountAllElements6;

import java.util.PriorityQueue;

public class QueueSize {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Welcome");
        queue.add("To");
        queue.add("Java");
        queue.add("By");
        queue.add("Protik");

        System.out.println("PriorityQueue: " + queue );

        System.out.println("The size of the queue is: " + queue.size());
    }
    }

