package ArrayListExample.ExtractPortionOfAnArrayList12;

import java.util.ArrayList;
import java.util.List;

public class ExtractElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        numbers.add(15);

        System.out.println("Original list "+numbers);
        List<Integer> numbersTaken = numbers.subList(0,4);//
        System.out.println("List after extract "+numbersTaken);
    }
}
