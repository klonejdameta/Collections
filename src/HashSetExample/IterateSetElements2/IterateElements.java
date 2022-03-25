package HashSetExample.IterateSetElements2;

import java.util.HashSet;
import java.util.Iterator;

public class IterateElements {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Red");
        set.add("Green");
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Yellow");

        Iterator<String> iterator = set.iterator();
        // Iterate the hash set
        while (iterator.hasNext()) {//return true if it finds next element
            System.out.println(iterator.next());
        }
    }
}
