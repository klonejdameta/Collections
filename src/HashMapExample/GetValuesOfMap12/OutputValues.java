package HashMapExample.GetValuesOfMap12;

import java.util.HashMap;

public class OutputValues {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();

        hmap.put("Key1", "Val1");
        hmap.put("Key2", "Val2");
        hmap.put("Key3", "Val3");
        hmap.put("Key4", "Val4");
        hmap.put("Key5", "Val5");
        System.out.println("Map values are "+hmap +"\n");
        //get values of Map using values() method
        System.out.println("Values of Map are: "+hmap.values());
    }
}
