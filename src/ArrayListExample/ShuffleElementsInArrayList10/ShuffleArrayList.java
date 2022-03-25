package ArrayListExample.ShuffleElementsInArrayList10;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);
        System.out.println("Numbers before shuffling "+numbers);

        Collections.shuffle(numbers);//it shuffle numbers everytime we exc code
        System.out.println("Numbers after shufling "+numbers);
    }
}
