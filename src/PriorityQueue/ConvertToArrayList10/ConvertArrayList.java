package PriorityQueue.ConvertToArrayList10;



import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConvertArrayList {
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.add(1);
        num.add(3);
        num.add(4);
        num.add(7);
        num.add(5);
        num.add(8);
        System.out.println("Queue elements "+num);
        List<Integer> num2 = new ArrayList<>(num);
        System.out.println("Array with queue elements "+num2);
    }
}
