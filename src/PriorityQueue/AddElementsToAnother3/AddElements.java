package PriorityQueue.AddElementsToAnother3;

import java.util.PriorityQueue;

public class AddElements {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(8);
        num.add(10);

        PriorityQueue<Integer> num2 = new PriorityQueue<>(num);
        System.out.println("Elements of num2 from num "+num2);

    }
}
