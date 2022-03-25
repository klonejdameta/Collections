package HashMapExample.CheckIfValueExist8;

import java.util.HashMap;

public class CheckValue {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Map values are "+map +"\n");

        boolean val = map.containsValue("Red");
        if (val){
            System.out.println("Values exist in map: "+map.get(1));
        }else {
            System.out.println("Value does not exist in Map");
        }

    }
}
