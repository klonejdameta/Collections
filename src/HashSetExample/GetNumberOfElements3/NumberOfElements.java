package HashSetExample.GetNumberOfElements3;

import java.util.HashSet;
import java.util.Set;

public class NumberOfElements {
    public static void main(String[] args) {
        Set<Integer> val = new HashSet<>();
        val.add(3);
        val.add(5);
        val.add(4);
        val.add(6);
        val.add(1);
        System.out.println("Elements of Set are "+val+ "\n");//it contains only unique values
        System.out.println("Number of elements is "+ val.size());

    }
}
