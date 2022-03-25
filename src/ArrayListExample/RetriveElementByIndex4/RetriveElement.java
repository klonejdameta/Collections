package ArrayListExample.RetriveElementByIndex4;

import java.util.ArrayList;

public class RetriveElement {
    public static void main(String[] args) {

        ArrayList<Integer> val = new ArrayList<>();
        val.add(3);
        val.add(6);
        val.add(9);
        val.add(12);
        val.add(15);
        System.out.println("Values of list are "+val);

        for (int i = 0; i < val.size(); i++) {
        }
        System.out.println("Value of element at index 2 is " + val.get(2));
    }
}
