package HashSetExample.EmptyHashSet4;

import java.util.HashSet;
import java.util.Set;

public class EmptyHashSet {
    public static void main(String[] args) {
        Set<String> col = new HashSet<>();
        col.add("Purple");
        col.add("Green");
        col.add("Black");
        col.add("Red");
        System.out.println("Elements of Set "+ col +"\n");
        col.clear();//method to empty Set
        System.out.println(col);
    }
}
