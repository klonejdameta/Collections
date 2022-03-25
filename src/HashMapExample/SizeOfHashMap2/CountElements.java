package HashMapExample.SizeOfHashMap2;

import java.util.HashMap;
import java.util.Map;

public class CountElements {
    public static void main(String[] args) {
        Map<Integer,String> lang = new HashMap<>();
        lang.put(1,"Java");
        lang.put(2,"JavaScript");
        lang.put(3,"Angular");
        lang.put(4,"Python");
        lang.put(5,"C#");
        System.out.println("Size of HashMap: " +lang.size());
    }
}
