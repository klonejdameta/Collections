package ArrayListExample.CopyArrayListToAnother9;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);

        ArrayList<Integer> num = new ArrayList<>(numbers);
        System.out.println(num);
    }
}
