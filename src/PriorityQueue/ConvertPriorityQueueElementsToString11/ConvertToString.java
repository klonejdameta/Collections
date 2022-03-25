package PriorityQueue.ConvertPriorityQueueElementsToString11;

import java.util.PriorityQueue;

public class ConvertToString {
    public static void main(String[] args) {
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("First Priority Queue: "+pq1);
        //Convert Priority Queue to a string representation
        String str;
        str=pq1.toString();
        System.out.println("String values of Priority Queue "+str);
    }
}
