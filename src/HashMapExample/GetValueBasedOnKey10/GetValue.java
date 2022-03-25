package HashMapExample.GetValueBasedOnKey10;

import java.util.HashMap;

public class GetValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Map values are "+map +"\n");
        System.out.println("Value of Key 4 is: "+map.get(4));
    }
}
