package HashSetExample.RemoveAllElements12;

import java.util.HashSet;

public class RemoveAllElements {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(2);
        num.add(4);
        num.add(8);
        num.add(10);

        num.clear();
        System.out.println(num);

    }
}
