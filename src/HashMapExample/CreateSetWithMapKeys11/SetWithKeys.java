package HashMapExample.CreateSetWithMapKeys11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SetWithKeys {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();

        hmap.put("Key1", "Val1");
        hmap.put("Key2", "Val2");
        hmap.put("Key3", "Val3");
        hmap.put("Key4", "Val4");
        hmap.put("Key5", "Val5");
        System.out.println("Map values are "+hmap +"\n");

        /* public Set<K> keySet(): Returns a Set view of the keys contained
         * in this map. The set is backed by the map, so changes to the map
         * are reflected in the set, and vice-versa.
         */
        System.out.println("Values of Set are ");
        Set<String> keys = hmap.keySet();//type(String) should be the same as Map keys
        Iterator<String> iterator = keys.iterator();//iterate through Set values
        while (iterator.hasNext()){
            System.out.println(iterator.next());//  // Displaying keys. Output will not be in any particular order
        }
    }
}
