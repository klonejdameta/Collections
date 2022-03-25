package ArrayListExample.EmptyArrayList17;

import java.util.ArrayList;

public class EmptyArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0,1);
        numbers.add(1,1);
        numbers.add(2,2);
        numbers.add(3,3);
        numbers.add(4,4);
        System.out.println("Elements before empty "+numbers);
        numbers.clear();
        System.out.println(numbers);
    }
}
