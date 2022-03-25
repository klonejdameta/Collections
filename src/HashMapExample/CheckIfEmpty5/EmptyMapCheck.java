package HashMapExample.CheckIfEmpty5;

import java.util.HashMap;
import java.util.Map;

public class EmptyMapCheck {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "C#");
        map.put(2, "C++");
        map.put(3, "Java");
        map.put(4, "Python");
        map.put(5, "Ruby");

        //isEmpty() returns true or false
       boolean check =map.isEmpty();
       if (check){
           System.out.println("Map is empty");
       }else {
           System.out.println("Map is not empty.\n" + "This are Map elements "+map);
       }

    }
}
