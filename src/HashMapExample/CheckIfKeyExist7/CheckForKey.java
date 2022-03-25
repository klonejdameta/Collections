package HashMapExample.CheckIfKeyExist7;

import java.util.HashMap;

public class CheckForKey {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Map values are "+map +"\n");
        boolean exist = map.containsKey(4);
        if (exist){
            System.out.println("Key 4 exist in Map ");
        }else {
            System.out.println("Key does not exist in Map");
        }
        //map.containsValue() check if values exist in Map
    }
}
