package HashSetExample.ConvertHashSetToTreeSet8;

import java.util.HashSet;
import java.util.TreeSet;

public class ConvertToTreeSet {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(2);
        num.add(4);
        num.add(8);
        num.add(10);
        System.out.println("HashSet Elements are " + num + "\n");
        TreeSet<Integer> tree = new TreeSet<>(num);

        for (Integer i :tree
             ) {
            System.out.println("TreeSet Elements are "+i);
        }
    }
}
