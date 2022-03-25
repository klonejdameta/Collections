package HashMapExample.RemoveAllMapings4;

import java.util.HashMap;

public class RemoveAllElements {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();

        hashmap.put(11,"Value1");
        hashmap.put(22,"Value2");
        hashmap.put(33,"Value3");
        hashmap.put(44,"Value4");
        hashmap.put(55,"Value5");
        System.out.println("\n HashMap Elements: " + hashmap);
        hashmap.clear();
        System.out.println("Remoning all elements from Map "+hashmap);

    }
}
