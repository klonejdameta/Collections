package HashMapExample.OutputValueAndKeyOfElements1;

import java.util.HashMap;
import java.util.Map;

public class KeyAndValue {
    public static void main(String[] args) {
        Map<Integer,String> lang = new HashMap<>();
        lang.put(1,"Java");
        lang.put(2,"JavaScript");
        lang.put(3,"Angular");
        lang.put(4,"Python");
        System.out.println("HashMap elements are "+ lang + "\n");

        System.out.println("Return set of key/value pairs "+lang.entrySet() +"\n");
        /*the entrySet() method returns a set view of all the entries from the hashmap.
        The entrySet() method can be used with the for-each loop to iterate through each entry of the hashmap*/

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // access each entry of the hashmap
        System.out.print("Entries: ");
        // entrySet() returns a set view of all entries
        // for-each loop access each entry from the view
        for(Map.Entry<String, Integer> entry: numbers.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}
