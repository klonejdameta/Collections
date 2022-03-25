package PriorityQueue.MaximumPriorityQueue12;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(7);
        pq.add(5);
        pq.add(8);
        System.out.println("Values of Priority Queue "+ pq +"\n");
        System.out.print("Maximum Priority Queue: ");
        Integer val = null;                                            //since we are using Integer not Int
        while( (val = pq.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }
    }

