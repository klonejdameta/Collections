package HashSetExample.CloneHashSet6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CloneSet {
    public static void main(String[] args) {
        HashSet<String> val = new HashSet<>();
        val.add("Val1");
        val.add("Val2");
        val.add("Val3");
        val.add("Val4");
        val.add("Val5");
        System.out.println("Original HashSet "+ val +"\n");

        HashSet<String> val2 = new HashSet<>();
        val2=(HashSet)val.clone();
        System.out.println("Cloned HashSet "+ val2 +"\n");

        HashSet<String> val3 = new HashSet<>(val);
        System.out.println("Adding values through constructor " + val3);

        /*HashSet<String> h_set = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        HashSet <String> new_h_set = new HashSet <String> ();
        new_h_set = (HashSet)h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);*/

    }
}
