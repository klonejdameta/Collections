package HashMapExample.CopyValuesFromAMap3;

import java.util.HashMap;

public class CopyValues {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(1, "C#");
        hashmap.put(2, "C++");
        hashmap.put(3, "Java");
        System.out.println("\nValues in first map: " + hashmap);

        HashMap <Integer,String> hashmap1 = new HashMap <> (hashmap);
        hashmap1.put(4, "Python");
        hashmap1.put(5, "Ruby");
        System.out.println("\nValues in second map: " + hashmap1);
    }
}
