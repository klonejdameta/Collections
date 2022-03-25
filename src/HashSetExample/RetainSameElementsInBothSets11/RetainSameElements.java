package HashSetExample.RetainSameElementsInBothSets11;

import java.util.HashSet;

public class RetainSameElements {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(5);
        num.add(9);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(5);
        num2.add(6);

        num2.retainAll(num);//it is a boolean method

        System.out.println("Same elements are: "+num2);
    }
}
