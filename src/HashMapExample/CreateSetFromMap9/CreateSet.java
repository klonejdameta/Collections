package HashMapExample.CreateSetFromMap9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateSet {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "C#");
        map.put(2, "C++");
        map.put(3, "Java");
        map.put(4, "Python");
        map.put(5, "Ruby");
        System.out.println("Map values are "+map);
        //create Set with values from Map
        Set set = map.entrySet();
        System.out.println("Values of Set are :"+set);
    }
}
